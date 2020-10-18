package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.AbstractView;
import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

    protected AbstractView createView(Game game) {
        return new View(game);
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
