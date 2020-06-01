package corsacavalli;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

//Costruzione del percorso di gara

public class Campo extends JPanel{
	
	public void paint(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, 1000, 645);
		//Linee laterali
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 10);
		g.fillRect(0, 100, 1000, 10);
		g.fillRect(0, 200, 1000, 10);
		g.fillRect(0, 300, 1000, 10);
		g.fillRect(0, 400, 1000, 10);
		g.fillRect(0, 500, 1000, 10);
		g.fillRect(0, 600, 1000, 10);
		// Traguardo
		g.fillRect(960, 0, 5, 645);
		g.fillRect(970, 0, 5, 645);
		g.fillRect(980, 0, 5, 645);
	}
}