package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.Session;

public class ActionController extends Controller {

    ActionController(Session session) {
        super(session);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.session.addProposedCombination(proposedCombination);
    }

    public boolean isLooser() {
        return this.session.isLooser();
    }

    public boolean isWinner() {
        return this.session.isWinner();
    }

    public int getAttempts() {
        return this.session.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.session.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.session.getResult(position);
    }


}
