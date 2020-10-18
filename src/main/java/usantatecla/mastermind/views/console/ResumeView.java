package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.controllers.LogicResume;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.YesNoDialog;

class ResumeView {

    private final LogicResume logicResume;

    public ResumeView(Logic logicResume) {
        this.logicResume = logicResume;
    }

    boolean interact() {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.logicResume.clear();
        }
        return newGame;
    }

}
