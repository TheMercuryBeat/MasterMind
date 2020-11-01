package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.FrameType;
import usantatecla.mastermind.controllers.implementation.LogicImplementation;
import usantatecla.mastermind.distributed.dispatchers.*;

class LogicServerImplementation extends LogicImplementation {

    void associateDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.ADD_PROPOSAL, new AddProposalDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_RESULT, new ResultDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_PROPOSAL, new GetProposalDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_ATTEMPTS, new AttemptsDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.NEXT_STATE, new NextStateDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.RESUME, new ResumeDispatcher(this.resumeControllerImplementation));
    }

}
