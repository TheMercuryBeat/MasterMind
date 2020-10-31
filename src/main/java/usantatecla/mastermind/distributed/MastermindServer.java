package usantatecla.mastermind.distributed;

public class MastermindServer {

    private final DispatcherPrototype dispatcherPrototype;

    private final LogicServer logic;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        this.logic = new LogicServer(true);
        this.logic.associateDispatchers(this.dispatcherPrototype);
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }
}
