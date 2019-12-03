package fr.lewon.nn.examples.game.obstacle;

import fr.lewon.nn.examples.game.GameElement;
import fr.lewon.nn.examples.game.GameElementType;

public class ObstacleElement extends GameElement {

    public ObstacleElement(double orientation, double width, double height, double x, double y, boolean alive) {
        super(GameElementType.OBSTACLE, orientation, width, height, x, y, alive);
    }
}
