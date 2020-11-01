package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.utils.WithConsoleView;

public class ProposedCombinationView extends WithConsoleView {

    private final ProposedCombination proposedCombination;

    public ProposedCombinationView(ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public void write() {
        for (Color color : this.proposedCombination.getColors()) {
            new ColorView(color).write();
        }
    }

}
