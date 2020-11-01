package usantatecla.mastermind.distributed;

import usantatecla.mastermind.Mastermind;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.distributed.proxy.LogicProxy;
import usantatecla.mastermind.views.AbstractView;
import usantatecla.mastermind.views.console.View;

class MastermindClient extends Mastermind {

    protected Logic createLogic() {
        return new LogicProxy();
    }

    protected AbstractView createView() {
        return new View();
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }
}
