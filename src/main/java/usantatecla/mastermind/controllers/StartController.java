package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.StartView;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    public void control() {
        new StartView().write();
        this.session.next();
    }
}
