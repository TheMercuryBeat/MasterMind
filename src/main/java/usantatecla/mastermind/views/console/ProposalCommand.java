package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.models.ProposedCombination;

import static usantatecla.mastermind.views.MessageView.PROPOSAL_COMMAND;

class ProposalCommand extends AbstractCommand {

    public ProposalCommand(ProposalController proposalController) {
        super(PROPOSAL_COMMAND.getMessage(), proposalController);
    }

    @Override
    public void execute() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.proposalController.addProposedCombination(proposedCombination);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
