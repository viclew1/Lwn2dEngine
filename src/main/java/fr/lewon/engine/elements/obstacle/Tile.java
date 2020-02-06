package fr.lewon.engine.elements.obstacle;

import fr.lewon.engine.elements.GameElement;
import fr.lewon.engine.elements.GameElementType;

public abstract class Tile extends GameElement {

    public Tile(GameElementType type, float orientation) {
        super(type, orientation);
    }
}
