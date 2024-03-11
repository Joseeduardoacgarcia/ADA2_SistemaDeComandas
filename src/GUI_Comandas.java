import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		list.setBounds(423, 87, 452, 410);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Sistema de Comandas");
		lblNewLabel.setFont(new Font("Impact", Font.ITALIC, 40));
		lblNewLabel.setBounds(272, 23, 393, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mostrar Comandas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton.setBounds(150, 161, 175, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enviar a Cocina");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton_1.setBounds(150, 270, 175, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Status de Comandas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				modeloLista.clear();
				cola.add(new Comanda("Mesa 1", 2), 75.0,"Preparado"));
		        cola.add(new Comanda("mesa 2", 1, 60.0, "Preparando" ));
		        cola.add(new Comanda("mesa 3", 3, 85.75, "Preparando"));
	            cola.add(new Comanda("mesa 4", 4, 70.0, "Preparando"));
	            cola.add(new Comanda("mesa 5", 2, 95.5, "Preparando"));
	    		cola.add(new Comanda("mesa 6", 3, 100.0, "Preparando"));
	    		cola.add(new Comanda("mesa 7", 1, 77.5, "Preparando"));
	    		cola.add(new Comanda("mesa 8", 4, 86.8, "Preparando"));
	    		cola.add(new Comanda("mesa 9", 2, 90.0, "Preparando"));
	    		cola.add(new Comanda("mesa 10", 3, 105.25, "Preparando"));
	    		cola.add(new Comanda("mesa 11", 1, 67.8, "Preparando"));
	    		cola.add(new Comanda("mesa 12", 4, 110.0, "Preparando"));
	    		cola.add(new Comanda("mesa 13", 2, 81.5, "Preparando"));
	    	    cola.add(new Comanda("mesa 14", 3, 98.75, "Preparando"));
	    	    cola.add(new Comanda("mesa 15", 1, 84.0, "Preparando"));
	    					    		

				
				while (!cola.isEmpaty()) {
					Comanda comanda = cola.remover();
					if (comanda.getEstado().equals("preparado")) {
						comanda.setEstado("servidas");
					}
					modeloLista3.addElement("nombre:" + comanda.getNombre()+"-Estado:" + comanda.getEstado() +"\n");
					modeloLista3.addElement("----------");
					
				}
			}
		});
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton_2.setBounds(150, 377, 175, 53);
		contentPane.add(btnNewButton_2);
	}

}
