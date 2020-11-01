package usantatecla.mastermind.distributed.proxy;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.models.StateValue;

public class LogicProxy extends Logic {

    private final TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.controllers.put(StateValue.INITIAL, new StartControllerProxy(this.session, this.tcpip));
        this.controllers.put(StateValue.PROPOSAL, new ProposalControllerProxy(this.session, this.tcpip));
        this.controllers.put(StateValue.RESUME, new ResumeControllerProxy(this.session, this.tcpip));
        this.controllers.put(StateValue.EXIT, null);

    }
}
