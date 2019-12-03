package fr.lewon.nn.examples.game.engine;

import fr.lewon.nn.examples.game.GameElement;

public class Intersection {

    GameElement element1;
    GameElement element2;

    public Intersection(GameElement element1, GameElement element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public GameElement getElement1() {
        return this.element1;
    }

    public void setElement1(GameElement element1) {
        this.element1 = element1;
    }

    public GameElement getElement2() {
        return this.element2;
    }

    public void setElement2(GameElement element2) {
        this.element2 = element2;
    }
}
