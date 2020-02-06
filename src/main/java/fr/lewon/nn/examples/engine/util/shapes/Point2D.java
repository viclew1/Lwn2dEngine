package fr.lewon.nn.examples.engine.util.shapes;

public class Point2D {

    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D point) {
        this(point.x, point.y);
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public void moveForward(float orientation, float length) {
        this.x = (float) (this.x + Math.cos(orientation) * length);
        this.y = (float) (this.y - Math.sin(orientation) * length);
    }

    public void moveHorizontally(float orientation, float length) {
        orientation += Math.PI / 2;
        this.x = (float) (this.x + Math.cos(orientation) * length);
        this.y = (float) (this.y - Math.sin(orientation) * length);
    }

}
