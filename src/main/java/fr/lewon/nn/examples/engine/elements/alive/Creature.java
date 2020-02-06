package fr.lewon.nn.examples.engine.elements.alive;

import fr.lewon.nn.examples.engine.elements.GameElement;
import fr.lewon.nn.examples.engine.elements.GameElementType;

public abstract class Creature extends GameElement {

    public Creature(GameElementType type, float orientation) {
        super(type, orientation);
    }
}
