package fr.lewon.nn.examples.game.alive.dodgers;

import fr.lewon.nn.examples.game.GameElementType;
import fr.lewon.nn.examples.game.alive.AliveElement;

public class ComplexDodger extends AliveElement {

    public ComplexDodger(double orientation, double width, double height, double x, double y, boolean alive) {
        super(GameElementType.COMPLEX_DODGER, orientation, width, height, x, y, alive);
    }
}
