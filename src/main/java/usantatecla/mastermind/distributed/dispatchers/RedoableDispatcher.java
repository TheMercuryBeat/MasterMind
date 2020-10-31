package usantatecla.mastermind.distributed.dispatchers;


import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;

public class RedoableDispatcher extends Dispatcher {

    public RedoableDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((ProposalController) this.acceptorController).isRedoable());
    }

}
