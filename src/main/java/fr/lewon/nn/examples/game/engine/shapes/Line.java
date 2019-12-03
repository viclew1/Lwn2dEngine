package fr.lewon.nn.examples.game.engine.shapes;

import fr.lewon.nn.examples.game.engine.Shape;

public class Line extends Shape {

    private double fromX;
    private double fromY;
    private double toX;
    private double toY;

    public Line(double fromX, double fromY, double toX, double toY) {
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }

    @Override
    protected Rectangle generateAroundRectangle() {
        return new Rectangle(this.fromX, this.fromY, this.toX - this.fromX, this.toY - this.fromY);
    }
}
