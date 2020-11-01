package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;
import usantatecla.mastermind.models.ProposedCombination;

public class GetProposalDispatcher extends Dispatcher {

    public GetProposalDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        int position = this.tcpip.receiveInt();
        ProposedCombination proposedCombination =
                ((ProposalController) this.acceptorController).getProposedCombination(position);

        this.tcpip.sendProposedCombination(proposedCombination);
    }

}