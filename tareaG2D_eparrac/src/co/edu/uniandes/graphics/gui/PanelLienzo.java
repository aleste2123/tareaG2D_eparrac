package co.edu.uniandes.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PanelLienzo extends JPanel {

	public PanelLienzo() {
		this.setSize(700, 700);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D.Double rect_gris = new Rectangle2D.Double(0, 0, 699, 6999);
		g2d.setColor(Color.gray);
		g2d.fill(rect_gris);
		Ellipse2D.Double elipse_negro = new Ellipse2D.Double(350, 30, 100, 100);
		g2d.setColor(Color.black);
		g2d.fill(elipse_negro);
		Rectangle2D.Double rectangulo_black = new Rectangle2D.Double(390, 129, 20, 41);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_black);
		RoundRectangle2D.Double rectangulo_r_black = new RoundRectangle2D.Double(320, 170, 25, 180, 20, 20);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_r_black);
		RoundRectangle2D.Double rectangulo_r_black_2 = new RoundRectangle2D.Double(455, 170, 25, 180, 20, 20);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_r_black_2);
		Rectangle2D.Double rectangulo_black_2 = new Rectangle2D.Double(335, 170, 130, 40);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_black_2);
		RoundRectangle2D.Double rectangulo_r_gris_1 = new RoundRectangle2D.Double(345, 200, 15, 40, 20, 20);
		g2d.setColor(Color.gray);
		g2d.fill(rectangulo_r_gris_1);
		RoundRectangle2D.Double rectangulo_r_gris_2 = new RoundRectangle2D.Double(440, 200, 15, 40, 20, 20);
		g2d.setColor(Color.gray);
		g2d.fill(rectangulo_r_gris_2);
		Rectangle2D.Double rectangulo_black_3 = new Rectangle2D.Double(360, 170, 80, 180);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_black_3);
		RoundRectangle2D.Double rectangulo_r_black_3 = new RoundRectangle2D.Double(360, 330, 35, 180, 20, 20);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_r_black_3);
		RoundRectangle2D.Double rectangulo_r_black_4 = new RoundRectangle2D.Double(405, 330, 35, 180, 20, 20);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_r_black_4);
		
		Polygon base = new Polygon(new int[] { 230, 250, 550, 570 }, new int[] { 550, 500, 500, 550 }, 4);
		g2d.setColor(Color.black);
		g2d.fill(base);
		
		
		//banda presidencial 
		
		g2d.setColor(Color.yellow);
		for (int n = 0; n < 18; n++) {
			g2d.drawLine(360,270+n, 420+n, 170);
		}
		g2d.setColor(Color.blue);
		for (int n = 0; n < 15; n++) {
			g2d.drawLine(360,288+n, 438+n, 170);
		
		}
		g2d.setColor(Color.red);
		for (int n = 0; n < 12; n++) {
			g2d.drawLine(360,303+n, 453+n, 170);
		
		}
		
		//corazon
		
		
		Ellipse2D.Double elipse_ = new Ellipse2D.Double(467, 320, 10, 10);
		g2d.setColor(Color.red);
		g2d.fill(elipse_);
		Ellipse2D.Double elipse_2 = new Ellipse2D.Double(458, 320, 10, 10);
		g2d.setColor(Color.red);
		g2d.fill(elipse_2);
		Rectangle2D.Double rectangulo_bl = new Rectangle2D.Double(458, 325, 20, 10);
		g2d.setColor(Color.black);
		g2d.fill(rectangulo_bl);
		Polygon triangulo = new Polygon(new int[] { 458, 477, 468 }, new int[] { 325, 325, 340 }, 3);
		g2d.setColor(Color.red);
		g2d.fill(triangulo);
		
		
		//espada
		
		Rectangle2D.Double rect_bl = new Rectangle2D.Double(345, 325, 10, 10);
		g2d.setColor(new Color(128,64,0));
		g2d.fill(rect_bl);
		Rectangle2D.Double rect_bl_2 = new Rectangle2D.Double(310, 315, 10, 30);
		g2d.setColor(new Color(192, 192, 192));
		g2d.fill(rect_bl_2);
		Rectangle2D.Double rect_bl_3 = new Rectangle2D.Double(180, 320, 130, 20);
		g2d.setColor(Color.lightGray);
		g2d.fill(rect_bl_3);
		Polygon triangulo_1 = new Polygon(new int[] { 150, 180, 180 }, new int[] { 330, 320, 340 }, 3);
		g2d.setColor(Color.lightGray);
		g2d.fill(triangulo_1);
		g2d.setColor(Color.black);
		g2d.drawLine(180,330, 310, 330);
		
		
		
		//estrella
		
	
		g2d.setColor(new Color(255,213,21));
		for (int n = 0; n < 100; n += 3) {
			g2d.drawLine(100,n, 100-n, 100);
			g2d.drawLine(100,n, 100+n, 100);
			g2d.drawLine(100,200-n, 100-n, 100);
			g2d.drawLine(100,200-n, 100+n, 100);
			
		
		}
		
		
		
		
		
		
		
			
	
	}

	

}
