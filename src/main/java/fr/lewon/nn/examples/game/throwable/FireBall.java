package fr.lewon.nn.examples.game.throwable;

import fr.lewon.nn.examples.game.GameElementType;

public class FireBall extends ThrowableElement {

    public FireBall(double orientation, double width, double height, double x, double y, boolean alive, int damages) {
        super(GameElementType.FIREBALL, orientation, width, height, x, y, alive, damages);
    }
}
