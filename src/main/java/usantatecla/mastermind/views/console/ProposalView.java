package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.LogicProposal;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

    private final LogicProposal logicProposal;
    private final SecretCombinationView secretCombinationView;

    public ProposalView(LogicProposal logicProposal) {
        this.logicProposal = logicProposal;
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.logicProposal.addProposedCombination(proposedCombination);
        this.console.writeln();
        MessageView.ATTEMPTS.writeln(this.logicProposal.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.logicProposal.getAttempts(); i++) {
            new ProposedCombinationView(this.logicProposal.getProposedCombination(i)).write();
            new ResultView(this.logicProposal.getResult(i)).writeln();
        }
        if (this.logicProposal.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.logicProposal.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
