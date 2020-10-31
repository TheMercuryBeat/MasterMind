package usantatecla.mastermind;

import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

    protected View createView() {
        return new View();
    }

    protected boolean isStandalone() {
        return true;
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
