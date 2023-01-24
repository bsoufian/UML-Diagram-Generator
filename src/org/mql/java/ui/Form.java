package org.mql.java.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Form extends JFrame{
	private JPanel pane;

	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		pane.setLayout(new BorderLayout(0, 0));
		setContentPane(pane);
	}
	


	public static void main(String[] args) {
		Form frame = new Form();
		frame.setVisible(true);
		
	}

}
