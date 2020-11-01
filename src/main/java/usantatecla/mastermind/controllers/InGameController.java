package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.MessageView;
import usantatecla.mastermind.views.ProposedCombinationView;
import usantatecla.mastermind.views.ResultView;
import usantatecla.mastermind.views.SecretCombinationView;
import usantatecla.utils.Console;

public abstract class InGameController extends Controller {

    InGameController(Session session) {
        super(session);
    }

    protected abstract void inGameControl();

    public abstract boolean isActive();

    @Override
    public void control() {
        this.inGameControl();
        Console.instance().writeln();
        MessageView.ATTEMPTS.writeln(this.session.getAttempts());
        new SecretCombinationView().writeln();

        for (int i = 0; i < this.session.getAttempts(); i++) {
            new ProposedCombinationView(this.session.getProposedCombination(i)).write();
            new ResultView(this.session.getResult(i)).writeln();
        }

        if (this.session.isWinner()) {
            MessageView.WINNER.writeln();
            this.session.next();
        } else if (this.session.isLooser()) {
            MessageView.LOOSER.writeln();
            this.session.next();
        }
    }

}
