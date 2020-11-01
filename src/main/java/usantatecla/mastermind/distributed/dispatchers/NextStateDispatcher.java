package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;

public class NextStateDispatcher extends Dispatcher {

    public NextStateDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        ((ProposalController) this.acceptorController).next();
    }

}