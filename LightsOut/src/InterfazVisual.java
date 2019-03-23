
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.Timer;

public class InterfazVisual implements ActionListener {

	private JFrame frame;
	private boolean[] pantallas;
	private int ANCHO, ALTO;
	private Timer time;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisual window = new InterfazVisual();
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
	public InterfazVisual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		inicializarVariables();
		inicializarVentana();
		System.out.println(ANCHO+" "+ ALTO);
		
		iniciar();
		tick();
		
	}
	
	public void tick() {
		ajustarTamano();
		actualizarPantalla();
		
	}
	
	private void actualizarPantalla() {
		
		mostrarMenu();
		if (pantallas[0]) 
		{
			mostrarMenu();
		}
		
		else 
		{
			mostrarJuego();
		}	
	}

	private void mostrarJuego() {
		
		
	}
	

	public void mostrarMenu() 
	{
		frame.getContentPane().setLayout(null);
		JLabel background = new JLabel();
		background.setBounds(0, 0, ANCHO, ALTO);
		Image fondo = Herramientas.cargarImagen("/fondo.png",background.getWidth(),background.getHeight(),this);
		background.setIcon(new ImageIcon(fondo));
		frame.getContentPane().add(background);
//		System.out.println(background.getWidth()+" "+background.getHeight()+" , "+ANCHO+" "+ ALTO);
		
	}
	
	public void inicializarVariables() {
		this.ALTO = Toolkit.getDefaultToolkit().getScreenSize().height/2;
		this.ANCHO = Toolkit.getDefaultToolkit().getScreenSize().width/2;
		pantallas = new boolean[2];
		pantallas[0] = true;
		pantallas[1] = false;
	}
	
	private void ajustarTamano() 
	{
		frame.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent arg0) {
				escalar();
				
				
			}
		});
	}

	private void inicializarVentana() 
	{
		frame = new JFrame();
		frame.setFocusable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, ANCHO, ALTO);	
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
	
		definirTamanoMinimo();
	}

	private void definirTamanoMinimo() 
	{
		Dimension tamanoMinimo = new Dimension();
		tamanoMinimo.height = ALTO;
		tamanoMinimo.width = ANCHO;
		frame.setMinimumSize(tamanoMinimo);
	}
	
	private void escalar() 
	{
		ANCHO = frame.getBounds().width;
		ALTO = frame.getBounds().height;
	}
	
	 public void iniciar()
	    {
	    	
	        time = new Timer(10, this);
	        time.start();        
	    }

	public void actionPerformed(ActionEvent arg0) {
		frame.getContentPane().repaint();
		
	}
	
}
