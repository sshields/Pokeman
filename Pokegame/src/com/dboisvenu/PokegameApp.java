package com.dboisvenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;

public class PokegameApp implements ActionListener {

	private JFrame frame;
	JButton btn1 = new JButton("Choose Player");
	JButton btn2 = new JButton("South");
	JButton btn3 = new JButton("East");
	JButton btn4 = new JButton("West");
	JButton btn5 = new JButton("Center");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokegameApp window = new PokegameApp();
					//window.frame.setBounds(500, 50, 800, 800);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PokegameApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PokeGame");
		//frame.setBounds(100, 100, 1450, 1300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(new BoardPane());
        btn1.addActionListener(this);
        frame.getContentPane().add(btn1, BorderLayout.NORTH);
        frame.getContentPane().add(btn2, BorderLayout.SOUTH);
        frame.getContentPane().add(btn3, BorderLayout.EAST);
        frame.getContentPane().add(btn4, BorderLayout.WEST);
        //frame.getContentPane().add(btn5, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e) {
        if ("Choose Player".equals(e.getActionCommand())) {
            //b2.setEnabled(false);
            //b1.setEnabled(false);
            //b3.setEnabled(true);
        } else {
        	//b2.setEnabled(true);
            //b1.setEnabled(true);
            //b3.setEnabled(false);
        }
    }

}
