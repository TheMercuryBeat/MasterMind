package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.FrameType;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.distributed.dispatchers.*;

public class LogicServer extends Logic {

    public LogicServer(boolean isStandalone) {
        super(isStandalone);
    }

    public void associateDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startController));
        dispatcherPrototype.add(FrameType.ADD_PROPOSAL, new AddProposalDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.GET_RESULT, new ResultDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.GET_PROPOSAL, new GetProposalDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.GET_ATTEMPTS, new AttemptsDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.NEXT_STATE, new NextStateDispatcher(this.proposalController));
        dispatcherPrototype.add(FrameType.RESUME, new ResumeDispatcher(this.resumeController));
    }

}
