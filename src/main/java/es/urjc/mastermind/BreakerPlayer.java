package es.urjc.mastermind;

public class BreakerPlayer extends Player {

    private ProposedCombination proposedCombination;

    public BreakerPlayer(Board board) {
        super(board);
        this.proposedCombination = new ProposedCombination();
    }

    public void play() {
        this.proposedCombination.putProposedCombination();
        this.board.setProposedCombination(this.proposedCombination);
    }
}
