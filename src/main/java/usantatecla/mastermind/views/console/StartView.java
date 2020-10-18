package usantatecla.mastermind.views.console;

import usantatecla.mastermind.views.MessageView;

class StartView {

    void interact() {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
    }

}
