package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

class RedoController extends InGameController {

    RedoController(Session session) {
        super(session);
    }

    @Override
    protected void inGameControl() {
        this.session.redo();
    }

    @Override
    public boolean isActive() {
        return this.session.isRedoable();
    }

}
