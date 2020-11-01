package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.models.SessionImplementation;
import usantatecla.mastermind.models.StateValue;

public class LogicImplementation extends Logic {

    protected StartControllerImplementation startControllerImplementation;
    protected ProposalControllerImplementation proposalControllerImplementation;
    protected ResumeControllerImplementation resumeControllerImplementation;

    public LogicImplementation() {
        this.session = new SessionImplementation();
        this.startControllerImplementation = new StartControllerImplementation(this.session);
        this.proposalControllerImplementation = new ProposalControllerImplementation(this.session);
        this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
        this.controllers.put(StateValue.INITIAL, this.startControllerImplementation);
        this.controllers.put(StateValue.PROPOSAL, this.proposalControllerImplementation);
        this.controllers.put(StateValue.RESUME, this.resumeControllerImplementation);
        this.controllers.put(StateValue.EXIT, null);
    }
}
