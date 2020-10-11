package es.urjc.mastermind;

import java.util.Arrays;
import java.util.Collections;

public class SecretCombination extends Combination {

    public SecretCombination() {
        super();

        Color[] colors = new Color[Color.values().length];
        for (int i = 0; i < Color.values().length; i++) {
            colors[i] = Color.get(i);
        }

        Collections.shuffle(Arrays.asList(colors));
        for (int i = 0; i < this.getNumberHoles(); i++) {
            this.colors[i] = colors[i];
        }
    }

}
