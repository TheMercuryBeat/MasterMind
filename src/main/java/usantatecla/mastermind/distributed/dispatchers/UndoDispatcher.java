package usantatecla.mastermind.distributed.dispatchers;


import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;

public class UndoDispatcher extends Dispatcher {

    public UndoDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        ((ProposalController) this.acceptorController).undo();
    }

}
