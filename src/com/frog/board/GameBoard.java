package com.frog.board;

import com.frog.pieces.Guard;
import com.frog.pieces.Leader;
import com.frog.pieces.Team;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {
    final int cellSize = 100;
    public GameBoard(){
        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Graphics gr = this.getGraphics();
    }
    @Override
    public void paint(Graphics gr){
        super.paint(gr);

        // Print board
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                GameCell cell = new GameCell(row, col, cellSize, gr);
                cell.render(gr);
            }
        }

        // Print Pieces
        Leader leaderYellow = new Leader(Team.YELLOW);
        leaderYellow.render(gr);
        Leader leaderGreen = new Leader(Team.GREEN);
        leaderGreen.render(gr);

        for(int i = 0; i < 4; i++){
            Guard guardYellow = new Guard(Team.YELLOW, i);
            guardYellow.render(gr);
            Guard guardGreen = new Guard(Team.GREEN, i);
            guardGreen.render(gr);
        }

        // Print center
        int x = 50 + 2 * 100 + 50 - 25;
        int y = x;
        gr.setColor(Color.gray);
        gr.fillOval(x, y, 50, 50);
    }
}
