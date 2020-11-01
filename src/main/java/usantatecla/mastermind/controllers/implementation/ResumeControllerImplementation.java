package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.ControllerVisitor;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    SessionImplementation sessionImplementation;

    ResumeControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.sessionImplementation.clear();
        } else {
            this.sessionImplementation.next();
        }
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
