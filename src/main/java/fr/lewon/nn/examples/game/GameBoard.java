package fr.lewon.nn.examples.game;

import fr.lewon.nn.examples.game.obstacle.ObstacleElement;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    private int width;
    private int height;
    private List<ObstacleElement> obstacles = new ArrayList<>();
    private List<GameElement> elements = new ArrayList<>();

    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {

    }

    public void updateAll() {
        this.elements.removeIf(g -> !g.isAlive());
        this.updatePositions();
        this.computeCollisions();
    }

    public void updatePositions() {

    }

    public void computeCollisions() {

    }

}
