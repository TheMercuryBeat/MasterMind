package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;

public class Logic implements LogicProposal, LogicResume {

    private final Game game;
    private final ProposalController proposalController;
    private final ResumeController resumeController;

    public Logic() {
        this.game = new Game();
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposalController.addProposedCombination(proposedCombination);
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.proposalController.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.proposalController.getResult(position);
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    public void clear() {
        this.resumeController.clear();
    }
}
