package fr.lewon.nn.examples.game;

public class GameElement {

    private final GameElementType type;
    private double orientation;
    private double width;
    private double height;
    private double x;
    private double y;
    private boolean alive = true;

    public GameElement(GameElementType type, double orientation, double width, double height, double x, double y, boolean alive) {
        this.type = type;
        this.orientation = orientation;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.alive = alive;
    }

    public GameElementType getType() {
        return this.type;
    }

    public double getOrientation() {
        return this.orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
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

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
