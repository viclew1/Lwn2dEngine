package fr.lewon.nn.examples.game.engine.shapes;

import fr.lewon.nn.examples.game.engine.Shape;

public class Rectangle extends Shape {

    private double minX;
    private double minY;
    private double width;
    private double height;

    public Rectangle(double minX, double minY, double width, double height) {
        this.minX = minX;
        this.minY = minY;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.minX, rectangle.minY, rectangle.width, rectangle.height);
    }

    public double getMinX() {
        return this.minX;
    }

    public void setMinX(double minX) {
        this.minX = minX;
    }

    public double getMinY() {
        return this.minY;
    }

    public void setMinY(double minY) {
        this.minY = minY;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    protected Rectangle generateAroundRectangle() {
        return new Rectangle(this);
    }
}
