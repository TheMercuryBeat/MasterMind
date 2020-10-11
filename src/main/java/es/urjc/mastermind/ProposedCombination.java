package es.urjc.mastermind;


import es.urjc.utils.Console;

public class ProposedCombination extends Combination {

    public ProposedCombination() {
        super();
    }

    public void putProposedCombination() {
        Error error;

        do {
            Message.PROPOSE_COMBINATION.write();
            String colors = Console.instance().readString();
            error = this.checkError(colors);
            error.writeln();
            if (!error.isNull()) {
                this.colors = new Color[this.getNumberHoles()];
            }
        } while (!error.isNull());

    }

    private Error checkError(String colorCharacters) {

        if (colorCharacters.length() != this.getNumberHoles()) {
            return Error.WRONG_LENGTH;
        }

        for (int i = 0; i < colorCharacters.length(); i++) {

            char[] colorCharacter = colorCharacters.toCharArray();
            Color color = Color.get(colorCharacter[i]);

            if (color == null) {
                return Error.WRONG_COLORS;
            }

            for (int j = 0; j < i; j++) {
                if (colorCharacter[i] == colorCharacter[j]) {
                    return Error.DUPLICATE_COLORS;
                }
            }

            this.colors[i] = color;
        }
        return Error.NULL_ERROR;
    }

    public boolean contains(Color color) {
        for (Color value : this.colors) {
            if (value == color) {
                return true;
            }
        }
        return false;
    }
}
