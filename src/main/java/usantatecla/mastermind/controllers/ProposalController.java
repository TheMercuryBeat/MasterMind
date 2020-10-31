package usantatecla.mastermind.controllers;

import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.Session;

public class ProposalController extends AcceptorController {

    private final ActionController actionController;
    private final UndoController undoController;
    private final RedoController redoController;

    ProposalController(Session session, TCPIP tcpip) {
        super(session, tcpip);
        this.actionController = new ActionController(this.session);
        this.undoController = new UndoController(this.session);
        this.redoController = new RedoController(this.session);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        if (this.tcpip == null) {
            this.actionController.addProposedCombination(proposedCombination);
        } else {
            this.tcpip.send(FrameType.ADD_PROPOSAL.name());
            this.tcpip.sendProposedCombination(proposedCombination);
        }
    }

    public boolean isLooser() {
        if (this.tcpip == null) {
            return this.actionController.isLooser();
        }
        this.tcpip.send(FrameType.LOOSER.name());
        return this.tcpip.receiveBoolean();
    }

    public boolean isWinner() {
        if (this.tcpip == null) {
            return this.actionController.isWinner();
        }
        this.tcpip.send(FrameType.WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    public int getAttempts() {
        if (this.tcpip == null) {
            return this.actionController.getAttempts();
        }
        this.tcpip.send(FrameType.GET_ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    public ProposedCombination getProposedCombination(int position) {
        if (this.tcpip == null) {
            return this.actionController.getProposedCombination(position);
        }
        this.tcpip.send(FrameType.GET_PROPOSAL.name());
        this.tcpip.send(position);
        return this.tcpip.receiveProposedCombination();
    }

    public Result getResult(int position) {
        if (this.tcpip == null) {
            return this.actionController.getResult(position);
        }
        this.tcpip.send(FrameType.GET_RESULT.name());
        this.tcpip.send(position);
        int blacks = this.tcpip.receiveInt();
        int whites = this.tcpip.receiveInt();
        return new Result(blacks, whites);
    }

    public void undo() {
        if (this.tcpip == null) {
            this.undoController.undo();
        } else {
            this.tcpip.send(FrameType.UNDO.name());
        }
    }

    public boolean isUndoable() {
        if (this.tcpip == null) {
            return this.undoController.isUndoable();
        }
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    public void redo() {
        if (this.tcpip == null) {
            this.redoController.redo();
        } else {
            this.tcpip.send(FrameType.REDO.name());
        }
    }

    public boolean isRedoable() {
        if (this.tcpip == null) {
            return this.redoController.isRedoable();
        }
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    public void next() {
        if (this.tcpip == null) {
            super.next();
        } else {
            this.tcpip.send(FrameType.NEXT_STATE.name());
        }
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
