package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

    private final ProposalController proposalController;
    private final SecretCombinationView secretCombinationView;

    ProposalView(ProposalController proposalController) {
        this.proposalController = proposalController;
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.proposalController.addProposedCombination(proposedCombination);
        this.console.writeln();
        MessageView.ATTEMPTS.writeln(this.proposalController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.proposalController.getAttempts(); i++) {
            new ProposedCombinationView(this.proposalController.getProposedCombination(i)).write();
            new ResultView(this.proposalController.getResult(i)).writeln();
        }
        if (this.proposalController.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.proposalController.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
