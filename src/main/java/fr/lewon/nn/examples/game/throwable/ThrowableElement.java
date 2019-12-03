package fr.lewon.nn.examples.game.throwable;

import fr.lewon.nn.examples.game.GameElement;
import fr.lewon.nn.examples.game.GameElementType;

public abstract class ThrowableElement extends GameElement {

    private int damages;

    public ThrowableElement(GameElementType type, double orientation, double width, double height, double x, double y, boolean alive, int damages) {
        super(type, orientation, width, height, x, y, alive);
        this.damages = damages;
    }

    public int getDamages() {
        return this.damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }
}
