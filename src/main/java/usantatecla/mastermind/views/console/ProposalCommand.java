package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.Console;

import static usantatecla.mastermind.views.MessageView.PROPOSAL_COMMAND;

public class ProposalCommand extends AbstractCommand {

    private final SecretCombinationView secretCombinationView;

    public ProposalCommand(ProposalController proposalController) {
        super(PROPOSAL_COMMAND.getMessage(), proposalController);
        this.secretCombinationView = new SecretCombinationView();
    }

    @Override
    public void execute() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.proposalController.addProposedCombination(proposedCombination);
        Console.instance().writeln();
        MessageView.ATTEMPTS.writeln(this.proposalController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.proposalController.getAttempts(); i++) {
            new ProposedCombinationView(this.proposalController.getProposedCombination(i)).write();
            new ResultView(this.proposalController.getResult(i)).writeln();
        }
        if (this.proposalController.isWinner()) {
            MessageView.WINNER.writeln();
            this.proposalController.next();
        } else if (this.proposalController.isLooser()) {
            MessageView.LOOSER.writeln();
            this.proposalController.next();
        }
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
