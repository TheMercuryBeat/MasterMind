package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.AbstractView;
import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

    protected Logic createLogic() {
        return null;
    }

    protected AbstractView createView() {
        return new View();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
