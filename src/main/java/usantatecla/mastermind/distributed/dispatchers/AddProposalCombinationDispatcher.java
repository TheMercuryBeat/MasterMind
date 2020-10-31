package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;
import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.ProposedCombination;

public class AddProposalCombinationDispatcher extends Dispatcher {

    public AddProposalCombinationDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {

        int c1 = this.tcpip.receiveInt();
        int c2 = this.tcpip.receiveInt();
        int c3 = this.tcpip.receiveInt();
        int c4 = this.tcpip.receiveInt();

        ProposedCombination proposedCombination = new ProposedCombination();
        proposedCombination.getColors().add(Color.values()[c1]);
        proposedCombination.getColors().add(Color.values()[c2]);
        proposedCombination.getColors().add(Color.values()[c3]);
        proposedCombination.getColors().add(Color.values()[c4]);

        ((ProposalController) this.acceptorController).addProposedCombination(proposedCombination);
    }

}