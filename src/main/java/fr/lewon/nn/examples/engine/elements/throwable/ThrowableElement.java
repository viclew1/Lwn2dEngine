package fr.lewon.nn.examples.engine.elements.throwable;

import fr.lewon.nn.examples.engine.elements.GameElement;
import fr.lewon.nn.examples.engine.elements.GameElementType;

public abstract class ThrowableElement extends GameElement {

    private int damages;

    public ThrowableElement(GameElementType type, float orientation) {
        super(type, orientation);
        this.damages = this.damages;
    }

    public int getDamages() {
        return this.damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }
}
