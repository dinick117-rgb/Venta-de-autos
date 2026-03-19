import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Agencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Autos auto1 = new Autos("Ferrari", "Blanco", 200000, false);
	Autos auto2 = new Autos("Mercedes", "Rojo", 300000, false);
	Autos auto3 = new Autos("Renault", "Negro", 400000, false);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agencia frame = new Agencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Agencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo = new JLabel("Agencia");
		Titulo.setEnabled(false);
		Titulo.setBounds(240, 14, 49, 14);
		contentPane.add(Titulo);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Nicte Pamplona\\Downloads\\descargar (6).jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 39, 111, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Nicte Pamplona\\Downloads\\autoop.jpg"));
		btnNewButton_1_1.setBounds(162, 39, 111, 60);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\Nicte Pamplona\\Downloads\\descargar (7).jpg"));
		btnNewButton_1_1_1.setBounds(315, 39, 111, 60);
		contentPane.add(btnNewButton_1_1_1);
		
		
		JLabel Marca1 = new JLabel("Marca 1");
		Marca1.setBounds(38, 110, 48, 14);
		contentPane.add(Marca1);
		
		JLabel Marca2 = new JLabel("Marca 2");
		Marca2.setBounds(191, 110, 48, 14);
		contentPane.add(Marca2);
		
		JLabel Marca3 = new JLabel("Marca 3");
		Marca3.setBounds(342, 110, 48, 14);
		contentPane.add(Marca3);
		
		JLabel Color1 = new JLabel("Color1");
		Color1.setBounds(38, 126, 48, 14);
		contentPane.add(Color1);
		
		JLabel Precio1 = new JLabel("Prrecio1");
		Precio1.setBounds(38, 146, 48, 14);
		contentPane.add(Precio1);
		
		JLabel Color2 = new JLabel("Color2");
		Color2.setBounds(191, 126, 48, 14);
		contentPane.add(Color2);
		
		JLabel Precio2 = new JLabel("Precio2");
		Precio2.setBounds(191, 146, 48, 14);
		contentPane.add(Precio2);
		
		JLabel Color3 = new JLabel("Color3");
		Color3.setBounds(342, 126, 48, 14);
		contentPane.add(Color3);
		
		JLabel Precio3 = new JLabel("Precio3");
		Precio3.setBounds(342, 146, 48, 14);
		contentPane.add(Precio3);
		
		JLabel lblEstado1 = new JLabel("Estado1");
		lblEstado1.setBounds(38, 171, 83, 14);
		contentPane.add(lblEstado1);
		
		JLabel lblEstado2 = new JLabel("Estado2");
		lblEstado2.setBounds(191, 170, 82, 14);
		contentPane.add(lblEstado2);
		
		JLabel lblEstado = new JLabel("Estado3");
		lblEstado.setBounds(342, 170, 72, 14);
		contentPane.add(lblEstado);
		
		
		JButton btnVenta_1 = new JButton("Vender");
		btnVenta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auto1.vender();
				if (auto1.venta ==true) {
		        lblEstado1.setText("VENDIDO");
				}
				else
					lblEstado1.setText("NO VENDIDO");
			}
		});
		btnVenta_1.setBounds(10, 195, 88, 22);
		contentPane.add(btnVenta_1);
		
		JButton btnVender_2 = new JButton("Vender");
		btnVender_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auto2.vender();
				if (auto2.venta==true) {
		        lblEstado2.setText("VENDIDO");
				}
				else
					lblEstado2.setText("NO VENDIDO");
		        
			}
		});
		btnVender_2.setBounds(172, 195, 88, 22);
		contentPane.add(btnVender_2);
		
		JButton btnVenta_3 = new JButton("Vender");
		btnVenta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auto3.vender();
				if (auto3.venta==true) {
		        lblEstado.setText("VENDIDO");
				}
				else
					lblEstado.setText("NO VENDIDO");
		       
			}
		});
		btnVenta_3.setBounds(325, 195, 88, 22);
		contentPane.add(btnVenta_3);

		//COCHE 1
		
		Color1.setText(auto1.color);
		Marca1.setText(auto1.marca);
		Precio1.setText("" + auto1.precio);
		lblEstado1.setText("" + auto1.venta);
		if (auto1.venta== false) {
			lblEstado1.setText("Disponible");
		}
		else
			lblEstado1.setText("No Disponible");
		
		//COCHE 2
		
		Color2.setText(auto2.color);
		Marca2.setText(auto2.marca);
		Precio2.setText("" + auto2.precio);
		lblEstado2.setText("" + auto2.venta);
		if (auto2.venta== false) {
			lblEstado2.setText("Disponible");
		}
		else
			lblEstado2.setText("No Disponible");
		
		//COCHE 3
		
		Color3.setText(auto3.color);
		Marca3.setText(auto3.marca);
		Precio3.setText("" + auto3.precio);
		lblEstado.setText("" + auto3.venta);
		if (auto3.venta== false) {
			lblEstado.setText("Disponible");
		}
		else
			lblEstado.setText("No Disponible");
		
	}
}
