package fr.lewon.engine.elements.alive;

import fr.lewon.engine.elements.GameElement;
import fr.lewon.engine.elements.GameElementType;

public abstract class Creature extends GameElement {

    public Creature(GameElementType type, float orientation) {
        super(type, orientation);
    }
}
