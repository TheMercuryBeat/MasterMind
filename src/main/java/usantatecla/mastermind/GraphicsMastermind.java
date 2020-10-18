package usantatecla.mastermind;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.AbstractView;
import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

    protected AbstractView createView(ProposalController proposalController, ResumeController resumeController) {

        return new View(proposalController, resumeController);
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
