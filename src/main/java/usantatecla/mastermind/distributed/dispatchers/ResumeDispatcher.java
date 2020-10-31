package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.distributed.Dispatcher;

public class ResumeDispatcher extends Dispatcher {

    public ResumeDispatcher(ResumeController resumeController) {
        super(resumeController);
    }

    @Override
    public void dispatch() {
        boolean newGame = this.tcpip.receiveBoolean();
        ((ResumeController) this.acceptorController).resume(newGame);
    }

}
