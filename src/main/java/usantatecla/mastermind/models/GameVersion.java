package usantatecla.mastermind.models;

class GameVersion {

    private final ProposedCombination proposedCombination;
    private final Result result;
    private final int attempts;

    GameVersion(ProposedCombination proposedCombination, Result result, int attempts) {
        this.proposedCombination = proposedCombination.copy();
        this.result = result.copy();
        this.attempts = attempts;
    }

    public ProposedCombination getProposedCombination() {
        return proposedCombination;
    }

    public Result getResult() {
        return result;
    }

    public int getAttempts() {
        return attempts;
    }
}
