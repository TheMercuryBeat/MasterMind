package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.implementation.ProposalControllerImplementation;

class ProposalView {

    private final SecretCombinationView secretCombinationView;

    public ProposalView() {
        this.secretCombinationView = new SecretCombinationView();
    }

    void interact(ProposalControllerImplementation proposalController) {
        proposalController.next();
    }
}
