package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind {

	private final Game game;
	private final View view;

	private ConsoleMastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
