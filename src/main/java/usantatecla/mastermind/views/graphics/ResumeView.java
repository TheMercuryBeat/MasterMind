package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ResumeController;

class ResumeView {

    private final ResumeController resumeController;

    ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }

    boolean interact() {
        return false;
    }

}
