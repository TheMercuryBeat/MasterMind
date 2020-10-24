package usantatecla.mastermind.models;

import java.util.List;

class GameRegistry {

    private final Game game;
    private List<GameVersion> gameVersions;
    private int firstPrevious;

    GameRegistry(Game game) {
        this.game = game;
    }

    void reset() {

    }

    void undo() {

    }

    void redo() {

    }

    boolean isUndoable() {
        return false;
    }

    boolean isRedoable() {
        return false;
    }

}
