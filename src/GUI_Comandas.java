import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class GUI_Comandas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

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
		list.setBounds(724, 104, 232, 410);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Sistema de Comandas");
		lblNewLabel.setFont(new Font("Impact", Font.ITALIC, 40));
		lblNewLabel.setBounds(272, 23, 393, 53);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(356, 136, 289, 36);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
