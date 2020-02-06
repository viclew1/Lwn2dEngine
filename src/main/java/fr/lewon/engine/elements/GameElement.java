package fr.lewon.engine.elements;

import fr.lewon.engine.util.shapes.Point2D;
import fr.lewon.engine.util.shapes.Rectangle;
import javafx.scene.image.Image;

public class GameElement {

    private final GameElementType type;
    private Point2D center;
    private Rectangle hitBox;
    private Rectangle drawBox;
    private float orientation;
    private Image image;

    public GameElement(GameElementType type, float orientation) {
        this.type = type;
        this.orientation = orientation;
    }

    public GameElementType getType() {
        return this.type;
    }

    public float getOrientation() {
        return this.orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public Point2D getCenter() {
        return this.center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Rectangle getHitBox() {
        return this.hitBox;
    }

    public void setHitBox(Rectangle hitBox) {
        this.hitBox = hitBox;
    }

    public Rectangle getDrawBox() {
        return this.drawBox;
    }

    public void setDrawBox(Rectangle drawBox) {
        this.drawBox = drawBox;
    }

    public Image getImage() {
        return this.image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
