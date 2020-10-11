package es.urjc.mastermind;

public abstract class Combination {

    protected static final int NUMBER_HOLES = 4;
    protected Color[] colors;

    public Combination() {
        this.colors = new Color[NUMBER_HOLES];
    }

    public int getNumberHoles() {
        return NUMBER_HOLES;
    }

    public Color[] getColors() {
        return colors;
    }
}
