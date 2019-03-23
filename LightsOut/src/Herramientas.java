import java.awt.Image;

import javax.swing.ImageIcon;

public class Herramientas {

	
	public  static Image cargarImagen(String ruta, int ancho, int alto, Object o) {
		Image img =  new ImageIcon(o.getClass().getResource(ruta)).getImage();
		img.getScaledInstance(ancho, alto, img.SCALE_SMOOTH);
		return img;
	}
	
}
