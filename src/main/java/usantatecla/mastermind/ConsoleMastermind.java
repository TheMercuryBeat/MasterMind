package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.controllers.implementation.LogicImplementation;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

    protected Logic createLogic() {
        return new LogicImplementation();
    }

    protected View createView() {
        return new View();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
