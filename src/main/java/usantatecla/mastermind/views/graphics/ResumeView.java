package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        boolean newGame = new YesNoDialog().read(MessageView.RESUME.getMessage());
        resumeController.resume(newGame);
    }

}
