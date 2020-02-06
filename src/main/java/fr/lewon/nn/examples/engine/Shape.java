package fr.lewon.nn.examples.engine;

import fr.lewon.nn.examples.engine.util.shapes.Rectangle;

public abstract class Shape {

    private Rectangle aroundRectangle;

    public void updateAround() {
        this.aroundRectangle = this.generateAroundRectangle();
    }

    protected abstract Rectangle generateAroundRectangle();

    public Rectangle getAroundRectangle() {
        return this.aroundRectangle;
    }

    /**
     * Moves horizontally by dx and vertically by dy
     *
     * @param dx
     * @param dy
     */
    public abstract void move(float dx, float dy);

    /**
     * Moves along the passed orientation by the passed length
     *
     * @param orientation
     * @param length
     */
    public abstract void moveForward(float orientation, float length);

    /**
     * Moves along the horizontal axis (perpendicular to the passed orientation) by the passed length
     *
     * @param orientation
     * @param length
     */
    public abstract void moveHorizontally(float orientation, float length);

}
