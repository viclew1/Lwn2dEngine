package fr.lewon.engine.elements.throwable;

import fr.lewon.engine.elements.GameElement;
import fr.lewon.engine.elements.GameElementType;

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
