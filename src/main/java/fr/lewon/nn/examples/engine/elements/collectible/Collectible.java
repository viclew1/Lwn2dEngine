package fr.lewon.nn.examples.engine.elements.collectible;

import fr.lewon.nn.examples.engine.elements.GameElement;
import fr.lewon.nn.examples.engine.elements.GameElementType;

public abstract class Collectible extends GameElement {

    public Collectible(GameElementType type, float orientation) {
        super(type, orientation);
    }
}
