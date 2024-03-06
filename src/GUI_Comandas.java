import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI_Comandas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Comandas frame = new GUI_Comandas();
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
	public GUI_Comandas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1003, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(424, 87, 452, 410);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Sistema de Comandas");
		lblNewLabel.setFont(new Font("Impact", Font.ITALIC, 40));
		lblNewLabel.setBounds(272, 23, 393, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mostrar Comandas");
		btnNewButton.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton.setBounds(150, 161, 163, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enviar a Cocina");
		btnNewButton_1.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton_1.setBounds(150, 270, 163, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Status de Comandas");
		btnNewButton_2.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton_2.setBounds(150, 377, 163, 53);
		contentPane.add(btnNewButton_2);
	}

}
