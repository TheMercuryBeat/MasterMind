package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.StateValue;
import usantatecla.utils.TCPIP;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final Session session;
    private final Map<StateValue, AcceptorController> controllers;
    private final TCPIP tcpip;

    protected StartController startController;
    protected ProposalController proposalController;
    protected ResumeController resumeController;

    public Logic(boolean isStandalone) {

        if (isStandalone) {
            this.tcpip = null;
        } else {
            this.tcpip = TCPIP.createClientSocket();
        }

        this.session = new Session(this.tcpip);
        this.startController = new StartController(this.session, this.tcpip);
        this.proposalController = new ProposalController(this.session, this.tcpip);
        this.resumeController = new ResumeController(this.session, this.tcpip);

        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, this.startController);
        this.controllers.put(StateValue.PROPOSAL, this.proposalController);
        this.controllers.put(StateValue.RESUME, this.resumeController);
        this.controllers.put(StateValue.EXIT, null);

    }

    public AcceptorController getController() {
        return this.controllers.get(this.session.getValueState());
    }

    public void close() {
        this.tcpip.send(FrameType.CLOSE.name());
        this.tcpip.close();
    }

}
