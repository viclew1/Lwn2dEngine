package fr.lewon.nn.examples.game.alive;

import fr.lewon.nn.examples.game.GameElement;
import fr.lewon.nn.examples.game.GameElementType;

public abstract class AliveElement extends GameElement {

    public AliveElement(GameElementType type, double orientation, double width, double height, double x, double y, boolean alive) {
        super(type, orientation, width, height, x, y, alive);
    }
}
