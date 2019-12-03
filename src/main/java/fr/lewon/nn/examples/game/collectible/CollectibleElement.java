package fr.lewon.nn.examples.game.collectible;

import fr.lewon.nn.examples.game.GameElement;
import fr.lewon.nn.examples.game.GameElementType;

public abstract class CollectibleElement extends GameElement {

    public CollectibleElement(GameElementType type, double orientation, double width, double height, double x, double y, boolean alive) {
        super(type, orientation, width, height, x, y, alive);
    }
}
