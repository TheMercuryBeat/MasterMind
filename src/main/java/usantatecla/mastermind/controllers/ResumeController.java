package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController {

    ResumeController(Session session) {
        super(session);
    }

    public void resume() {
        this.session.clear();
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
