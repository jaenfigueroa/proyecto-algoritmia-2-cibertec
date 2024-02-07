package frames;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ClientesFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_nombres;
	private JTextField tf_apellidos;
	private JTextField tf_direccion;
	private JTextField tf_dni;
	private JTextField tf_telefono;
	private JTextField tf_codigoCliente;

	/**
	 * Create the frame.
	 */
	public ClientesFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1092, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 28, 96, 13);
		contentPane.add(lblNewLabel);
		
		tf_nombres = new JTextField();
		tf_nombres.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tf_nombres.setBounds(107, 25, 289, 19);
		contentPane.add(tf_nombres);
		tf_nombres.setColumns(10);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tf_apellidos.setColumns(10);
		tf_apellidos.setBounds(107, 64, 289, 19);
		contentPane.add(tf_apellidos);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidos.setBounds(10, 67, 96, 13);
		contentPane.add(lblApellidos);
		
		tf_direccion = new JTextField();
		tf_direccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tf_direccion.setColumns(10);
		tf_direccion.setBounds(107, 106, 289, 19);
		contentPane.add(tf_direccion);
		
		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDireccin.setBounds(10, 109, 96, 13);
		contentPane.add(lblDireccin);
		
		JLabel lblNewLabel_1_1 = new JLabel("DNI");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 197, 96, 13);
		contentPane.add(lblNewLabel_1_1);
		
		tf_dni = new JTextField();
		tf_dni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tf_dni.setColumns(10);
		tf_dni.setBounds(107, 194, 289, 19);
		contentPane.add(tf_dni);
		
		tf_telefono = new JTextField();
		tf_telefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tf_telefono.setColumns(10);
		tf_telefono.setBounds(107, 155, 289, 19);
		contentPane.add(tf_telefono);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelefono.setBounds(10, 158, 96, 13);
		contentPane.add(lblTelefono);
		
		JLabel lblCodigo = new JLabel("Codigo de cliente");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCodigo.setBounds(581, 31, 133, 13);
		contentPane.add(lblCodigo);
		
		tf_codigoCliente = new JTextField();
		tf_codigoCliente.setEditable(false);
		tf_codigoCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tf_codigoCliente.setColumns(10);
		tf_codigoCliente.setBounds(715, 28, 96, 19);
		contentPane.add(tf_codigoCliente);
		
		JComboBox cb_opciones = new JComboBox();
		cb_opciones.setModel(new DefaultComboBoxModel(new String[] {"Crear", "Modificar", "Consultar", "Eliminar", "Listar"}));
		cb_opciones.setBounds(867, 26, 180, 19);
		contentPane.add(cb_opciones);
		
		JButton btn_ok = new JButton("OK");
		btn_ok.setBounds(437, 195, 85, 21);
		contentPane.add(btn_ok);
		
		JTextArea ta_resultados = new JTextArea();
		ta_resultados.setBounds(10, 240, 1037, 377);
		contentPane.add(ta_resultados);
	}
}
