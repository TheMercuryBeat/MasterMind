package usantatecla.mastermind.distributed;

import usantatecla.mastermind.Mastermind;
import usantatecla.mastermind.views.AbstractView;
import usantatecla.mastermind.views.console.View;

public class MastermindClient extends Mastermind {

    @Override
    protected AbstractView createView() {
        return new View();
    }

    @Override
    protected boolean isStandalone() {
        return false;
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }
}
