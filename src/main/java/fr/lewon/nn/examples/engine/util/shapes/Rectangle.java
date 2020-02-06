package fr.lewon.nn.examples.engine.util.shapes;

import fr.lewon.nn.examples.engine.Shape;

public class Rectangle extends Shape {

    private Point2D topLeft;
    private Point2D bottomRight;

    public Rectangle(Point2D topLeft, Point2D bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(float minX, float minY, float width, float height) {
        this(new Point2D(minX, minY), new Point2D(minX + width, minY + height));
    }

    public Rectangle(Rectangle rectangle) {
        this(new Point2D(rectangle.topLeft), new Point2D(rectangle.bottomRight));
    }

    public Point2D getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(Point2D topLeft) {
        this.topLeft = topLeft;
    }

    public Point2D getBottomRight() {
        return this.bottomRight;
    }

    public void setBottomRight(Point2D bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    protected Rectangle generateAroundRectangle() {
        return new Rectangle(this);
    }

    @Override
    public void move(float dx, float dy) {
        this.topLeft.move(dx, dy);
        this.bottomRight.move(dx, dy);
    }

    @Override
    public void moveForward(float orientation, float length) {
        this.topLeft.moveForward(orientation, length);
        this.bottomRight.moveForward(orientation, length);
    }

    @Override
    public void moveHorizontally(float orientation, float length) {
        this.topLeft.moveHorizontally(orientation, length);
        this.bottomRight.moveHorizontally(orientation, length);
    }
}
