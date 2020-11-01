package usantatecla.mastermind.models;

public class SessionImplementation implements Session {

    private final Game game;
    private final GameRegistry gameRegistry;
    private final State state;

    public SessionImplementation() {
        this.game = new Game();
        this.gameRegistry = new GameRegistry(this.game);
        this.state = new State();
    }

    public void clear() {
        this.game.clear();
        this.gameRegistry.reset();
        this.state.reset();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
        this.gameRegistry.registry();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.game.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.game.getResult(position);
    }

    public void undo() {
        this.gameRegistry.undo();
    }

    public void redo() {
        this.gameRegistry.redo();
    }

    public boolean isUndoable() {
        return this.gameRegistry.isUndoable();
    }

    public boolean isRedoable() {
        return this.gameRegistry.isRedoable();
    }

    public void next() {
        this.state.next();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

}
