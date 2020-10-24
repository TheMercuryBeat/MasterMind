package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;

class ProposalView {

    void interact(ProposalController proposalController) {
        new ProposalMenu(proposalController).execute();
    }

}
