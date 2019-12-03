package fr.lewon.nn.examples.game.engine.util;

import fr.lewon.nn.examples.game.GameElement;

public class MoveUtil {

    private static final double HALF_PI = Math.PI / 2;

    private MoveUtil() {
    }

    /**
     * Moves the passed {@link GameElement} along its current orientation by the passed length
     *
     * @param gameElement
     * @param length
     */
    public static void moveForward(GameElement gameElement, double length) {
        double orientation = gameElement.getOrientation();
        double x = gameElement.getX();
        double y = gameElement.getY();
        gameElement.setX(x + Math.cos(orientation) * length);
        gameElement.setY(y - Math.sin(orientation) * length);
    }

    /**
     * Moves the passed {@link GameElement} along its horizontal axis (perpendicular to its current orientation) by the passed length
     *
     * @param length
     */
    public static void moveHorizontally(GameElement gameElement, double length) {
        double orientation = gameElement.getOrientation() + HALF_PI;
        double x = gameElement.getX();
        double y = gameElement.getY();
        gameElement.setX(x + Math.cos(orientation) * length);
        gameElement.setY(y - Math.sin(orientation) * length);
    }

    /**
     * Moves the passed {@link GameElement} ignoring its current orientation by the dx horizontally and dy vertically
     *
     * @param gameElement
     * @param dx
     * @param dy
     */
    public static void move(GameElement gameElement, double dx, double dy) {
        double x = gameElement.getX();
        double y = gameElement.getY();
        gameElement.setX(x + dx);
        gameElement.setY(y + dy);
    }

}
