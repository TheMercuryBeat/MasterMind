package usantatecla.mastermind.distributed.proxy;

import usantatecla.mastermind.controllers.FrameType;
import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.StateValue;

public class SessionProxy implements Session {

    private final TCPIP tcpip;

    SessionProxy(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    @Override
    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }
}
