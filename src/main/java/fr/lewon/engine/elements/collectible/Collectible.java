package fr.lewon.engine.elements.collectible;

import fr.lewon.engine.elements.GameElement;
import fr.lewon.engine.elements.GameElementType;

public abstract class Collectible extends GameElement {

    public Collectible(GameElementType type, float orientation) {
        super(type, orientation);
    }
}
