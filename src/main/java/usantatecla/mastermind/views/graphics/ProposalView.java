package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ProposalController;

class ProposalView {

    private final SecretCombinationView secretCombinationView;

    public ProposalView() {
        this.secretCombinationView = new SecretCombinationView();
    }

    void interact(ProposalController proposalController) {
        proposalController.next();
    }
}
