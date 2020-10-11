package es.urjc.mastermind;

public class MakerPlayer extends Player {

    private SecretCombination secretCombination;

    public MakerPlayer(Board board) {
        super(board);
        this.secretCombination = new SecretCombination();
        this.board.setSecretCombination(this.secretCombination);
    }

    public void play() {
        this.board.matchCombination();
    }
}
