package usantatecla.mastermind.models;

import java.util.List;

public class ProposedCombination extends Combination {

    public ProposedCombination() {
    }

    public ProposedCombination(ProposedCombination proposedCombination) {
        this();
        for (Color color : proposedCombination.getColors()) {
            this.getColors().add(color);
        }
    }

    boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

    boolean contains(Color color) {
        for (int i = 0; i < this.colors.size(); i++) {
            if (this.colors.get(i) == color) {
                return true;
            }
        }
        return false;
    }

    public List<Color> getColors() {
        return this.colors;
    }

    public ProposedCombination copy() {
        return new ProposedCombination(this);
    }
}
