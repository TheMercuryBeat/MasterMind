package usantatecla.mastermind.distributed.proxy;

import usantatecla.mastermind.controllers.FrameType;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.Session;

public class ProposalControllerProxy extends ProposalController {

    private final TCPIP tcpip;

    ProposalControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.tcpip.send(FrameType.ADD_PROPOSAL.name());
        this.tcpip.sendProposedCombination(proposedCombination);
    }

    public boolean isLooser() {
        this.tcpip.send(FrameType.LOOSER.name());
        return this.tcpip.receiveBoolean();
    }

    public boolean isWinner() {
        this.tcpip.send(FrameType.WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    public int getAttempts() {
        this.tcpip.send(FrameType.GET_ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    public ProposedCombination getProposedCombination(int position) {
        this.tcpip.send(FrameType.GET_PROPOSAL.name());
        this.tcpip.send(position);
        return this.tcpip.receiveProposedCombination();
    }

    public Result getResult(int position) {
        this.tcpip.send(FrameType.GET_RESULT.name());
        this.tcpip.send(position);
        int blacks = this.tcpip.receiveInt();
        int whites = this.tcpip.receiveInt();
        return new Result(blacks, whites);
    }

    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    public boolean isUndoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    public boolean isRedoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    public void next() {
        this.tcpip.send(FrameType.NEXT_STATE.name());
    }

}
