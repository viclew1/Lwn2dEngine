package fr.lewon.nn.examples.game.engine;

import fr.lewon.nn.examples.game.engine.shapes.Rectangle;

public abstract class Shape {

    private Rectangle aroundRectangle;

    public void updateAround() {
        this.aroundRectangle = this.generateAroundRectangle();
    }

    protected abstract Rectangle generateAroundRectangle();

    public Rectangle getAroundRectangle() {
        return this.aroundRectangle;
    }

    public void setAroundRectangle(Rectangle aroundRectangle) {
        this.aroundRectangle = aroundRectangle;
    }
}
