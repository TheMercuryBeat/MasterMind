package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

class UndoController extends InGameController {

    UndoController(Session session) {
        super(session);
    }

    @Override
    protected void inGameControl() {
        this.session.undo();
    }

    @Override
    public boolean isActive() {
        return this.session.isUndoable();
    }

}
