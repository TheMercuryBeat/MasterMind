package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.models.Game;

class ProposalView {

	private final Game game;
	private final SecretCombinationView secretCombinationView;

	ProposalView(Game game) {
		this.game = game;
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		return false;
	}

}
