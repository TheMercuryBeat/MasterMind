package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.views.MessageView;

class StartView {

    void interact(StartController startController) {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
        startController.next();
    }

}
