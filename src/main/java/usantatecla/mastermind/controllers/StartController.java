package usantatecla.mastermind.controllers;

import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.models.Session;

public class StartController extends AcceptorController {

    StartController(Session session, TCPIP tcpip) {
        super(session, tcpip);
    }

    public void start() {
        if (this.tcpip == null) {
            this.session.next();
        } else {
            this.tcpip.send(FrameType.START.name());
        }
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
