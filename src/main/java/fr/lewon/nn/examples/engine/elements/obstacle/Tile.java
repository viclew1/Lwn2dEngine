package fr.lewon.nn.examples.engine.elements.obstacle;

import fr.lewon.nn.examples.engine.elements.GameElement;
import fr.lewon.nn.examples.engine.elements.GameElementType;

public abstract class Tile extends GameElement {

    public Tile(GameElementType type, float orientation) {
        super(type, orientation);
    }
}
