package es.urjc.mastermind;

import es.urjc.utils.Console;

enum Message {

    TITLE("--- MASTERMIND ---"),
    PROPOSE_COMBINATION("Propose a combination: "),
    ARROW(" ---> "),
    ATTEMPTS(":attempts attempt(s):"),
    BLACK_AND_WHITE(":blacks blacks and :whites whites"),
    SECRET_COMBINATION("xxxx"),
    WINNER("You win!!! :-)"),
    LOOSER("You lose!!! :-("),
    RESUME("Do you want to continue");

    private String message;

    Message(String message) {
        this.message = message;
    }

    void write() {
        Console.instance().write(this.message);
    }

    void writeln() {
        Console.instance().writeln(this.message);
    }

    void writeln(int attempts) {
        String message = ATTEMPTS.message.replace(":attempts", String.valueOf(attempts));
        Console.instance().writeln(message);
    }

    void writeln(int blacks, int whites) {

        String message = BLACK_AND_WHITE.message
                .replaceFirst(":blacks", String.valueOf(blacks))
                .replaceFirst(":whites", String.valueOf(whites));

        Console.instance().writeln(message);
    }

    @Override
    public String toString() {
        return this.message;
    }

}