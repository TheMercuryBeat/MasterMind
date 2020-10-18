package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.LogicProposal;

class ProposalView {

    private final LogicProposal logicProposal;
    private final SecretCombinationView secretCombinationView;

    ProposalView(LogicProposal logicProposal) {
        this.logicProposal = logicProposal;
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        return false;
    }

}
