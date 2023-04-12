package co.edu.uniandes.graphics.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class InterfazPrincipal extends JFrame {
	
	
	public InterfazPrincipal() {
		this.setSize(700,700);
		this.setResizable(false);
		this.setTitle("Java2D");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel dibujo = new PanelLienzo();
		this.add(dibujo, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		InterfazPrincipal ip = new InterfazPrincipal();
	}

}
