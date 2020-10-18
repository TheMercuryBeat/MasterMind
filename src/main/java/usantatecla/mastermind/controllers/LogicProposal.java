package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;

public interface LogicProposal {

    void addProposedCombination(ProposedCombination proposedCombination);

    int getAttempts();

    ProposedCombination getProposedCombination(int position);

    Result getResult(int position);

    boolean isWinner();

    boolean isLooser();
}
