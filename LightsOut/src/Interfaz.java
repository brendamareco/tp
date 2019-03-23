import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Choice;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Interfaz {

	private JFrame frmLightsOutV;
	private int ANCHO, ALTO;
	private JPanel pantallaInicio;
	private JPanel pantallaRegistro;
	private JLabel lblNombreDeUsuario;
	private JTextField textField;
	private JLabel lblContrasea;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frmLightsOutV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLightsOutV = new JFrame();
		frmLightsOutV.setTitle("Lights Out! v1.0  ~  by  Mareco & Fleita");
		frmLightsOutV.setIconImage(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/org/eclipse/jface/fieldassist/images/contassist_ovr@2x.png")));
		this.ALTO = Toolkit.getDefaultToolkit().getScreenSize().height/2;
		this.ANCHO = Toolkit.getDefaultToolkit().getScreenSize().width/2;
		frmLightsOutV.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent arg0) {
				ANCHO = frmLightsOutV.getBounds().width;
				ALTO = frmLightsOutV.getBounds().height;
				pantallaInicio.setBounds(0, 0, ANCHO, ALTO);
				pantallaRegistro.setBounds(0, 0, ANCHO, ALTO);
				
				
			}
		});
		frmLightsOutV.setBounds(0, 0, ANCHO, ALTO);	
		frmLightsOutV.setLocationRelativeTo(null);
		frmLightsOutV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLightsOutV.getContentPane().setLayout(null);
		
		pantallaRegistro = new JPanel();
		
		frmLightsOutV.getContentPane().add(pantallaRegistro);
		pantallaRegistro.setBackground(Color.WHITE);
		pantallaRegistro.setVisible(true);
		pantallaRegistro.setBounds(0, 0, ANCHO, ALTO);
		pantallaRegistro.setLayout(null);
		
		lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombreDeUsuario.setBounds(226, 74, 225, 14);
		pantallaRegistro.add(lblNombreDeUsuario);
		
		textField = new JTextField();
		textField.setBounds(226, 99, 225, 20);
		pantallaRegistro.add(textField);
		textField.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a\r\n\r\n");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasea.setBounds(226, 130, 225, 14);
		pantallaRegistro.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(226, 150, 225, 20);
		pantallaRegistro.add(passwordField);
		
		JLabel lblPersonaje = new JLabel("Personaje\r\n");
		lblPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPersonaje.setBounds(226, 181, 225, 14);
		pantallaRegistro.add(lblPersonaje);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mirmo", "Murumo", "Yashichi", "Yamane", "Papii", "Panta", "Rirumu"}));
		comboBox.setBounds(226, 206, 225, 22);
		pantallaRegistro.add(comboBox);
		
		Panel esquinas_1 = new Panel();
		esquinas_1.setBackground(new Color(46, 139, 87));
		esquinas_1.setBounds(0, 0, 178, 352);
		pantallaRegistro.add(esquinas_1);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(284, 265, 109, 43);
		pantallaRegistro.add(btnNewButton_1);
		
		Panel esquinas_2 = new Panel();
		esquinas_2.setBackground(new Color(46, 139, 87));
		esquinas_2.setBounds(495, 0, 178, 352);
		pantallaRegistro.add(esquinas_2);
		
		
		pantallaInicio = new JPanel();
		pantallaInicio.setBackground(Color.PINK);
		frmLightsOutV.getContentPane().add(pantallaInicio);
		pantallaInicio.setLayout(null);
		pantallaInicio.setVisible(false);
		pantallaInicio.setBounds(0, 0, ANCHO, ALTO);
		
		JButton btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(123, 198, 143, 62);
		pantallaInicio.add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrarse.setBounds(378, 198, 143, 62);
		pantallaInicio.add(btnRegistrarse);
		
		Image imagen = new ImageIcon(this.getClass().getResource("/fondo.png")).getImage();
		
		
	}
}
