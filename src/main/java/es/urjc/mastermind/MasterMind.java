package es.urjc.mastermind;

import es.urjc.utils.YesNoDialog;

public class MasterMind {

    private Board board;
    private Turn turn;

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        Message.TITLE.writeln();
        this.board = new Board();
        this.turn = new Turn(this.board);
        do {
            this.board.writeAttempts();
            this.turn.play();
        } while (!board.isBrokenCombination());

        Message message = this.board.isWinner() ? Message.WINNER : Message.LOOSER;
        message.writeln();
    }

    private boolean isResumedGame() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
