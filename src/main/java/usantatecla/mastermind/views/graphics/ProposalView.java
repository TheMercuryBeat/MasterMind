package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ProposalController;

class ProposalView {

    private final ProposalController proposalController;
    private final SecretCombinationView secretCombinationView;

    ProposalView(ProposalController proposalController) {
        this.proposalController = proposalController;
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        return false;
    }

}
