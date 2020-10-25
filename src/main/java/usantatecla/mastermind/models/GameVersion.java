package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

class GameVersion {

    private final List<ProposedCombination> proposedCombinations;
    private final List<Result> results;
    private final int attempts;

    GameVersion(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
        this.proposedCombinations = new ArrayList<>(proposedCombinations);
        this.results = new ArrayList<>(results);
        this.attempts = attempts;
    }

    public List<ProposedCombination> getProposedCombinations() {
        return proposedCombinations;
    }

    public List<Result> getResults() {
        return results;
    }

    public int getAttempts() {
        return attempts;
    }
}
