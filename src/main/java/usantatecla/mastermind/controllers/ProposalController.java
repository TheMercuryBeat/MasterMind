package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.Menu;
import usantatecla.mastermind.views.ProposalCommand;
import usantatecla.mastermind.views.RedoCommand;
import usantatecla.mastermind.views.UndoCommand;

public class ProposalController extends Controller {

    private final Menu menu;

    public ProposalController(Session session) {
        super(session);
        this.menu = new Menu();
        this.menu.addCommand(new ProposalCommand(new ActionController(this.session)));
        this.menu.addCommand(new UndoCommand(new UndoController(this.session)));
        this.menu.addCommand(new RedoCommand(new RedoController(this.session)));
    }

    public void control() {
        this.menu.execute();
    }
}
