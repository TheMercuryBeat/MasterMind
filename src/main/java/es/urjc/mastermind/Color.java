package es.urjc.mastermind;

public enum Color {

    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    ORANGE('o'),
    PURPLE('p');

    private char symbol;

    Color(char symbol) {
        this.symbol = symbol;
    }

    static Color get(int ordinal) {
        return Color.values()[ordinal];
    }

    static Color get(char color) {
        for (Color c : Color.values()) {
            if (c.symbol == color) {
                return c;
            }
        }
        return null;
    }

    public char getSymbol() {
        return symbol;
    }
}
