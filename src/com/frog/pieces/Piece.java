package com.frog.pieces;

import java.awt.*;

public abstract class Piece {
    final int marginTop = 50;
    final int marginLeft = 50;
    final int cellSize = 100;
    protected Team belongsToTeam;
    protected Piece(Team belongsToTeam){
        this.belongsToTeam = belongsToTeam;
    }
    public abstract void render(Graphics gr);
}
