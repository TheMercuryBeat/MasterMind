package usantatecla.mastermind.distributed.dispatchers;


import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;

public class StateDispatcher extends Dispatcher {

    public StateDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(this.acceptorController.getValueState().ordinal());
    }

}
