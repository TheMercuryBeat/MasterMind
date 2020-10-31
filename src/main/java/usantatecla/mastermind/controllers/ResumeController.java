package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.utils.TCPIP;

public class ResumeController extends AcceptorController {

    ResumeController(Session session, TCPIP tcpip) {
        super(session, tcpip);
    }

    public void resume(boolean newGame) {
        if (this.tcpip == null) {
            if (newGame) {
                this.session.clear();
            } else {
                this.session.next();
            }
        } else {
            this.tcpip.send(FrameType.RESUME.name());
            this.tcpip.send(newGame);
        }
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
