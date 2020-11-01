package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

    public String readProposedCombination() {
        MessageView.PROPOSED_COMBINATION.writeln();
        return this.console.readString();
    }

}
