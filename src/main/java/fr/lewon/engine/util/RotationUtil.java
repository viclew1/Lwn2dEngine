package fr.lewon.engine.util;

import fr.lewon.engine.elements.GameElement;

public class RotationUtil {

    private static final double TWO_PI = Math.PI * 2;

    private RotationUtil() {
    }

    /**
     * Rotates the passed {@link GameElement} by the passed rotation. The result orientation will be greater than 0 and lower than 2*PI
     *
     * @param gameElement
     * @param rotation
     */
    public static void rotateGameElement(GameElement gameElement, double rotation) {
        float currentOrientation = gameElement.getOrientation();
        currentOrientation += rotation;
        while (currentOrientation >= TWO_PI) {
            currentOrientation -= TWO_PI;
        }
        while (currentOrientation < 0) {
            currentOrientation += TWO_PI;
        }
        gameElement.setOrientation(currentOrientation);
    }

}
