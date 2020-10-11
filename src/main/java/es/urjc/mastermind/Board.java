package es.urjc.mastermind;


import es.urjc.utils.Console;

public class Board {

    private static final int MAX_NUMBER_ATTEMPTS = 10;
    private int numberAttempts;

    private Result[] results;
    private SecretCombination secretCombination;
    private ProposedCombination proposedCombination;

    public Board() {
        this.results = new Result[MAX_NUMBER_ATTEMPTS];
    }

    public void setSecretCombination(SecretCombination secretCombination) {
        this.secretCombination = secretCombination;
    }

    public void setProposedCombination(ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public void matchCombination() {
        Result result = new Result(this.proposedCombination, this.secretCombination);
        this.results[numberAttempts] = result;
    }

    public boolean isBrokenCombination() {
        return this.results[this.numberAttempts++].isWinner() || this.numberAttempts == MAX_NUMBER_ATTEMPTS;
    }

    public boolean isWinner() {
        return this.results[numberAttempts - 1].isWinner();
    }

    public void writeAttempts() {
        Console.instance().writeln();
        Message.SECRET_COMBINATION.writeln();
        Message.ATTEMPTS.writeln(this.numberAttempts);
        for (int i = 0; i < this.numberAttempts; i++) {
            this.results[i].writeProposedCombination();
        }
    }
}
