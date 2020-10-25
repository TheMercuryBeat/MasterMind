package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;

class ProposalMenu extends AbstractMenu {

    ProposalMenu(ProposalController proposalController) {
        this.addCommand(new ProposalCommand(proposalController));
        this.addCommand(new UndoCommand(proposalController));
        this.addCommand(new RedoCommand(proposalController));
    }

}
