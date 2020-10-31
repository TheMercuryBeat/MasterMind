package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;
import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.ProposedCombination;

public class GetProposalCombinationDispatcher extends Dispatcher {

    public GetProposalCombinationDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {

        int position = this.tcpip.receiveInt();
        ProposedCombination proposedCombination = ((ProposalController) this.acceptorController).getProposedCombination(position);
        for (Color color : proposedCombination.getColors()) {
            this.tcpip.send(color.ordinal());
        }

    }

}