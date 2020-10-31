package usantatecla.mastermind.controllers;

public enum FrameType {
    START,
    STATE,
    ADD_PROPOSAL,
    GET_PROPOSAL,
    GET_ATTEMPTS,
    GET_RESULT,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    NEXT_STATE,
    RESUME,
    LOOSER,
    WINNER,
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
