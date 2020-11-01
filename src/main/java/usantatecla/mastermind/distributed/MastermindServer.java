package usantatecla.mastermind.distributed;

class MastermindServer {

    private final DispatcherPrototype dispatcherPrototype;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        LogicServerImplementation logic = new LogicServerImplementation();
        logic.associateDispatchers(this.dispatcherPrototype);
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }
}
