package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.StartController;

class StartView {

    void interact(StartController startController) {
        new SecretCombinationView().writeln();
        startController.next();
    }

}
