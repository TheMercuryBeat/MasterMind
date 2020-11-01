package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.*;
import usantatecla.mastermind.views.ColorView;
import usantatecla.mastermind.views.ErrorView;
import usantatecla.mastermind.views.ProposalView;

class ActionController extends InGameController {

    ActionController(Session session) {
        super(session);
    }

    @Override
    protected void inGameControl() {
        ProposedCombination proposedCombination = this.readProposedCombination();
        this.session.addProposedCombination(proposedCombination);
    }

    @Override
    public boolean isActive() {
        return true;
    }

    ProposedCombination readProposedCombination() {

        ProposedCombination proposedCombination = new ProposedCombination();
        Error error;

        do {

            error = null;
            String characters = new ProposalView().readProposedCombination();

            if (characters.length() > Combination.getWidth()) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                    Color color = ColorView.getInstance(characters.charAt(i));
                    if (color == null) {
                        error = Error.WRONG_CHARACTERS;
                    } else {
                        if (proposedCombination.getColors().contains(color)) {
                            error = Error.DUPLICATED;
                        } else {
                            proposedCombination.getColors().add(color);
                        }
                    }
                }
            }

            if (error != null) {
                new ErrorView(error).writeln();
                proposedCombination.getColors().clear();
            }

        } while (error != null);

        return proposedCombination;
    }

}
