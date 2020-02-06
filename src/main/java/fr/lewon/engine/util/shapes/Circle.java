package fr.lewon.engine.util.shapes;

import fr.lewon.engine.Shape;

public class Circle extends Shape {

    private Point2D center;
    private float radius;

    @Override
    protected Rectangle generateAroundRectangle() {
        float diameter = 2 * this.radius;
        return new Rectangle(this.center.getX() - this.radius, this.center.getY() - this.radius, diameter, diameter);
    }

    @Override
    public void move(float dx, float dy) {
        this.center.move(dx, dy);
    }

    @Override
    public void moveForward(float orientation, float length) {
        this.center.moveForward(orientation, length);
    }

    @Override
    public void moveHorizontally(float orientation, float length) {
        this.center.moveHorizontally(orientation, length);
    }


}
