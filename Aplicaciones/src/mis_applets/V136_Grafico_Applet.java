package mis_applets;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class V136_Grafico_Applet extends JApplet {

	public void init() {

		String numero = getParameter("graficos");
		int n_graficos = Integer.parseInt(numero);

		int arrayGraficos[] = new int[n_graficos];

		for (int i = 0; i < arrayGraficos.length; i++) {
			arrayGraficos[i] = Integer.parseInt(getParameter("barra." + (i + 1)));
		}

		V136_LaminaGrafico milamina = new V136_LaminaGrafico(arrayGraficos);

		add(milamina);

	}

}

class V136_LaminaGrafico extends JPanel {

	public V136_LaminaGrafico(int valores[]) {
		valores_graficos = valores;
	}

	public void paint(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.rotate(180 / 180.0 * Math.PI, 100, 100);

		int pos_x = 0;

		for (int i = 0; i < valores_graficos.length; i++) {
			System.out.println(i + " " + valores_graficos[i]);
			Rectangle2D graf = new Rectangle2D.Double(pos_x, 0, 25, valores_graficos[i]);

			int color_rojo = (int) Math.round(Math.random() * 200);
			int color_verde = (int) Math.round(Math.random() * 200);
			int color_azul = (int) Math.round(Math.random() * 200);
			Color color_barra = new Color(color_rojo, color_verde, color_azul);

			g2.setPaint(color_barra);
			g2.fill(graf);
			pos_x += 25;
		}

	}

	private int[] valores_graficos;

}
