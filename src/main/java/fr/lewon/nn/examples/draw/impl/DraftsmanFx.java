package fr.lewon.nn.examples.draw.impl;

import fr.lewon.nn.examples.draw.Draftsman;
import fr.lewon.nn.examples.engine.elements.GameElement;
import javafx.scene.layout.Pane;

public class DraftsmanFx implements Draftsman {

    private Pane pane;

    public DraftsmanFx(Pane pane) {
        this.pane = pane;
    }

    @Override
    public void drawGameElement(GameElement gameElement) {
        //TODO impl
    }

}
