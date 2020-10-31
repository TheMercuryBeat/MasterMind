package usantatecla.mastermind.controllers;

public enum FrameType {
    MARTERMIND,
    START,
    STATE,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    ERRORS_PUT,
    NEXT_STATE,
    PROPOSAL,
    RESUME,
    NEW_GAME,
    LOOSER,
    WINNER,
    GET_ATTEMPTS,
    GET_PROPOSAL,
    GET_RESULT,
    CLOSE;

    public static FrameType parser(String string) {
        for (FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
