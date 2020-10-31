package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;
import usantatecla.mastermind.models.ProposedCombination;

public class AddProposalDispatcher extends Dispatcher {

    public AddProposalDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        ProposedCombination proposedCombination = this.tcpip.receiveProposedCombination();
        ((ProposalController) this.acceptorController).addProposedCombination(proposedCombination);
    }

}