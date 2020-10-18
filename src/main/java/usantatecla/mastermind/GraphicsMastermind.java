package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.AbstractView;
import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

    protected AbstractView createView(Logic logic) {
        return new View(logic);
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
