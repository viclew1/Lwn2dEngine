package fr.lewon.engine.elements.board;

import fr.lewon.engine.elements.GameElement;
import fr.lewon.engine.elements.obstacle.Tile;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    private List<Tile> tiles = new ArrayList<>();
    private List<GameElement> elements = new ArrayList<>();

    public void init() {

    }

    public void updateAll() {
        this.updatePositions();
        this.computeCollisions();
    }

    public void updatePositions() {

    }

    public void computeCollisions() {

    }

}
