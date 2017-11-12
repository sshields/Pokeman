package com.dboisvenu;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class BoardPane extends JPanel {
	
	public static int GRIDSIZE=20;

    public BoardPane() {
        setLayout(new GridBagLayout());
        setBackground(Color.RED);

        GridBagConstraints gbc = new GridBagConstraints();
        for (int row = 0; row < GRIDSIZE; row++) {
            for (int col = 0; col < GRIDSIZE; col++) {
                gbc.gridx = col;
                gbc.gridy = row;

                CellPane cellPane = new CellPane();
                Border border = null;
                if (row < GRIDSIZE-1) {
                    if (col < GRIDSIZE-1) {
                        border = new MatteBorder(1, 1, 0, 0, Color.GRAY);
                    } else {
                        border = new MatteBorder(1, 1, 0, 1, Color.GRAY);
                    }
                } else {
                    if (col < GRIDSIZE-1) {
                        border = new MatteBorder(1, 1, 1, 0, Color.GRAY);
                    } else {
                        border = new MatteBorder(1, 1, 1, 1, Color.GRAY);
                    }
                }
                cellPane.setBorder(border);
                add(cellPane, gbc);
            }
        }
    }
}
