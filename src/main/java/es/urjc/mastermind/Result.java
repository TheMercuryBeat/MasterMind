package es.urjc.mastermind;

import es.urjc.utils.Console;

public class Result {

    private Combination proposedCombination;
    private int black;
    private int white;

    public Result(ProposedCombination proposedCombination, SecretCombination secretCombination) {

        Color[] proposedColorCombination = proposedCombination.getColors();
        Color[] secretColorCombination = secretCombination.getColors();
        int blacks = 0;
        int whites = 0;

        for (int i = 0; i < secretColorCombination.length; i++) {
            if (secretColorCombination[i] == proposedColorCombination[i]) {
                blacks++;
            }
        }

        for (Color color : secretColorCombination) {
            if (proposedCombination.contains(color)) {
                whites++;
            }
        }

        this.proposedCombination = proposedCombination;
        this.black = blacks;
        this.white = whites - blacks;

    }

    public boolean isWinner() {
        return this.black == proposedCombination.getNumberHoles();
    }

    public void writeProposedCombination() {
        for (Color color : proposedCombination.getColors()) {
            Console.instance().write(color.getSymbol());
        }
        Message.ARROW.write();
        Message.BLACK_AND_WHITE.writeln(black, white);
    }

}
