package com.dboisvenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class CellPane extends JPanel {

	private static int CELLSIZE=10;
    private Color defaultBackground;

    public CellPane() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                defaultBackground = getBackground();
                setBackground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultBackground);
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(CELLSIZE, CELLSIZE);
    }
}
