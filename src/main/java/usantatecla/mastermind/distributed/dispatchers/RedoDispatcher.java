package usantatecla.mastermind.distributed.dispatchers;


import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;

public class RedoDispatcher extends Dispatcher {

    public RedoDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        ((ProposalController) this.acceptorController).redo();
    }

}
