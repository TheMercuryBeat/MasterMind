package usantatecla.mastermind.models;

public class State {

    private StateValue stateValue;

    State() {
        this.reset();
    }

    void reset() {
        this.stateValue = StateValue.INITIAL;
    }

    void next() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
    }

    StateValue getValueState() {
        return this.stateValue;
    }

}
