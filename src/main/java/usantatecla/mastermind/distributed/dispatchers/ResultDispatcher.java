package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.Dispatcher;
import usantatecla.mastermind.models.Result;

public class ResultDispatcher extends Dispatcher {

    public ResultDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        int position = this.tcpip.receiveInt();
        Result result = ((ProposalController) this.acceptorController).getResult(position);
        this.tcpip.send(result.getBlacks());
        this.tcpip.send(result.getWhites());
    }

}