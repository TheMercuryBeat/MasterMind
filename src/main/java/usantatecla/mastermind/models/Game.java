package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_LONG = 10;
    private SecretCombination secretCombination;
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;
    private int attempts;

    Game() {
        this.clear();
    }

    void clear() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<>();
        this.results = new ArrayList<>();
        this.attempts = 0;
    }

    void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
        this.attempts++;
    }

    boolean isLooser() {
        return this.attempts == Game.MAX_LONG;
    }

    boolean isWinner() {
        return this.results.get(this.attempts - 1).isWinner();
    }

    int getAttempts() {
        return this.attempts;
    }

    ProposedCombination getProposedCombination(int position) {
        return this.proposedCombinations.get(position);
    }

    Result getResult(int position) {
        return this.results.get(position);
    }

    GameVersion createGameVersion() {
        return new GameVersion(this.proposedCombinations, this.results, this.attempts);
    }

    void setGameVersion(GameVersion gameVersion) {
        this.proposedCombinations = gameVersion.getProposedCombinations();
        this.results = gameVersion.getResults();
        this.attempts = gameVersion.getAttempts();
    }

    static class GameVersion {

        private final List<ProposedCombination> proposedCombinations;
        private final List<Result> results;
        private final int attempts;

        GameVersion(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
            this.proposedCombinations = new ArrayList<>(proposedCombinations);
            this.results = new ArrayList<>(results);
            this.attempts = attempts;
        }

        private List<ProposedCombination> getProposedCombinations() {
            return proposedCombinations;
        }

        private List<Result> getResults() {
            return results;
        }

        private int getAttempts() {
            return attempts;
        }
    }
}
