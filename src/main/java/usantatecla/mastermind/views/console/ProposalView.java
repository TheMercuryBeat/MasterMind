package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.Console;

class ProposalView {

    private final SecretCombinationView secretCombinationView;

    public ProposalView() {
        this.secretCombinationView = new SecretCombinationView();
    }

    void interact(ProposalController proposalController) {
        new ProposalMenu(proposalController).execute();
        Console.instance().writeln();
        MessageView.ATTEMPTS.writeln(proposalController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController.getProposedCombination(i)).write();
            new ResultView(proposalController.getResult(i)).writeln();
        }
        if (proposalController.isWinner()) {
            MessageView.WINNER.writeln();
            proposalController.next();
        } else if (proposalController.isLooser()) {
            MessageView.LOOSER.writeln();
            proposalController.next();
        }
    }

}
