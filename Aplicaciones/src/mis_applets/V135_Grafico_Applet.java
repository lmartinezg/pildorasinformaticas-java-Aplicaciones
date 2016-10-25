package mis_applets;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class V135_Grafico_Applet extends JApplet {

	public void init() {

		// String numero1 = getParameter("barra.1");
		// String numero2 = getParameter("barra.2");
		// String numero3 = getParameter("barra.3");
		int numero1 = Integer.parseInt(getParameter("barra.1"));
		int numero2 = Integer.parseInt(getParameter("barra.2"));
		int numero3 = Integer.parseInt(getParameter("barra.3"));

		// MarcoGrafico mimarco=new MarcoGrafico();
		// mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// mimarco.setVisible(true);

		// setBounds(250,400,300,400);
		LaminaGrafico milamina = new LaminaGrafico(numero1, numero2, numero3);
		add(milamina);
		// setVisible(true);

	}

}

/*
 * class MarcoGrafico extends JFrame{
 * 
 * public MarcoGrafico(){
 * 
 * setBounds(250,400,300,400); LaminaGrafico milamina=new LaminaGrafico();
 * add(milamina); setVisible(true); }
 * 
 * }
 */

class LaminaGrafico extends JPanel {

	public LaminaGrafico(int a, int b, int c) {
		gr1 = a;
		gr2 = b;
		gr3 = c;
	}

	public void paint(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.rotate(180 / 180.0 * Math.PI, 125, 100);

		// Rectangle2D graf1 = new Rectangle2D.Double(50, 0, 50, 50);
		// Rectangle2D graf2 = new Rectangle2D.Double(100, 0, 50, 75);
		// Rectangle2D graf3 = new Rectangle2D.Double(150, 0, 50, 100);
		Rectangle2D graf1 = new Rectangle2D.Double(50, 0, 50, gr1);
		Rectangle2D graf2 = new Rectangle2D.Double(100, 0, 50, gr2);
		Rectangle2D graf3 = new Rectangle2D.Double(150, 0, 50, gr3);

		g2.setPaint(Color.RED);
		g2.fill(graf1);

		g2.setPaint(Color.YELLOW);
		g2.fill(graf2);

		g2.setPaint(Color.GREEN);
		g2.fill(graf3);

	}

	private int gr1, gr2, gr3;

}
