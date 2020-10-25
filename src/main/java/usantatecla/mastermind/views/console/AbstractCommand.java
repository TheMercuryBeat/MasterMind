package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.utils.Command;

abstract class AbstractCommand implements Command {

    protected String name;
    protected ProposalController proposalController;

    public AbstractCommand(String name, ProposalController proposalController) {
        this.name = name;
        this.proposalController = proposalController;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
