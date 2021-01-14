package com.frog.pieces;

import java.awt.*;

public class Leader extends Piece {
    public Leader(Team belongsToTeam){
        super(belongsToTeam);
    }

    @Override
    public void render(Graphics gr) {
        int x;
        int y;
        if (belongsToTeam == Team.YELLOW){
            x = marginLeft + cellSize * 4 + cellSize / 4;
            y = marginTop + cellSize / 4;
            gr.setColor(Color.yellow);

        } else {
            x = marginLeft + cellSize / 4;
            y = marginTop + cellSize * 4 + cellSize / 4;
            gr.setColor(Color.GREEN);

        }
        gr.fillRect(
                x,
                y,
                cellSize / 2,
                cellSize / 2
        );
    }
}
