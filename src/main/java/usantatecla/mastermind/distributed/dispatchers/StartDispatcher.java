package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.distributed.Dispatcher;

public class StartDispatcher extends Dispatcher {

    public StartDispatcher(StartController startController) {
        super(startController);
    }

    @Override
    public void dispatch() {
        ((StartController) this.acceptorController).start();
    }

}
