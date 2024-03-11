import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.util.PriorityQueue;
import java.util.Queue;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class GUI_Comandas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Equipo:
	//Ac Garcia Jose Eduardo
	//Balam Poot Juan Ulises
	//Mendoza Landero Ingrid Nayeli
	//Responsable de hacer el merge: Jose Eduardo Ac Garcia
	DefaultListModel modeloLista = new DefaultListModel();
	DefaultListModel modeloLista2 = new DefaultListModel();
	DefaultListModel modeloLista3 = new DefaultListModel();
	Queue <Comanda> cola=new PriorityQueue<Comanda>();
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
		setBounds(100, 100, 1023, 619);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JList list3 = new JList(modeloLista3);
		list3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		list3.setBounds(743, 87, 254, 405);
		contentPane.add(list3);
		
		JLabel lblNewLabel = new JLabel("Sistema de Comandas");
		lblNewLabel.setFont(new Font("Impact", Font.ITALIC, 40));
		lblNewLabel.setBounds(272, 23, 393, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mostrar Comandas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 modeloLista2.clear();
				 modeloLista3.clear();
				 cola.add(new Comanda("Mesa 1", 2, 75.0, "En espera"));
				 cola.add(new Comanda("Mesa 2", 1, 60.0, "En espera"));
				 cola.add(new Comanda("Mesa 3", 3, 85.75, "En espera"));
				 cola.add(new Comanda("Mesa 4", 4, 70.0, "En espera"));
				 cola.add(new Comanda("Mesa 5", 2, 95.5, "En espera"));
				 cola.add(new Comanda("Mesa 6", 3, 100.0, "En espera"));
				 cola.add(new Comanda("Mesa 7", 1, 77.5, "En espera"));
				 cola.add(new Comanda("Mesa 8", 4, 86.8, "En espera"));
				 cola.add(new Comanda("Mesa 9", 2, 90.0, "En espera"));
				 cola.add(new Comanda("Mesa 10", 3, 105.25, "En espera"));
				 cola.add(new Comanda("Mesa 11", 1, 67.8, "En espera"));
				 cola.add(new Comanda("Mesa 12", 4, 110.0, "En espera"));
				 cola.add(new Comanda("Mesa 13", 2, 81.5, "En espera"));
				 cola.add(new Comanda("Mesa 14", 3, 98.75, "En espera"));
				 cola.add(new Comanda("Mesa 15", 1, 84.0, "En espera"));
				 while (!cola.isEmpty()) {
	                    Comanda comanda = cola.remove();
	                    modeloLista.addElement(comanda);
	                    modeloLista.addElement("--------------");}

			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton.setBounds(103, 503, 301, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enviar a Cocina");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				modeloLista.clear();
				modeloLista3.clear();
				cola.add(new Comanda("Mesa 1 ", 2, 75.0,"En espera"));
				cola.add(new Comanda("Mesa 2 ", 1, 68.0,"En espera"));
				cola.add(new Comanda("Mesa 3 ", 3, 85.75,"En espera"));
				cola.add(new Comanda("Mesa 4 ", 4, 70.0, "En espera"));
				cola.add(new Comanda("Mesa 5 ", 2, 95.5, "En espera"));
				cola.add(new Comanda("Mesa 6 ", 3, 100.0,"En espera"));
				cola.add(new Comanda("Mesa 7 ", 1, 77.5, "En espera"));
				cola.add(new Comanda("Mesa 8 ", 4, 86.8, "En espera"));
				cola.add(new Comanda("Mesa 9 ", 2, 98.0, "En espera"));
				cola.add(new Comanda("Mesa 10 ", 3, 105.25,"En espera"));
				cola.add(new Comanda("Mesa 11 ", 1, 67.8, "En espera"));
				cola.add(new Comanda("Mesa 12 ", 4, 110.0,"En espera"));
				cola.add(new Comanda("Mesa 13 ", 2, 81.5, "En espera"));
				cola.add(new Comanda("Mesa 14 ", 3, 98.75,"En espera"));
				cola.add(new Comanda("Mesa 15", 1, 84.0, "En espera"));
				
				Queue<Comanda> colaActualizada = new PriorityQueue<>();
				while (!cola.isEmpty()) {
					Comanda comanda = cola.remove();
					//Cambia el estado solo si el estado atual es en "espera"
					if (comanda.getEstado().equals("En espera")) {
					comanda. setEstado ("Preparando");
					}
					colaActualizada. add (comanda) ;
					modeloLista2.addElement("Nombre: " + comanda.getNombre() +
					", Estado:"+ comanda.getEstado());
					modeloLista2.addElement("---------------");
					
				}

			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton_1.setBounds(544, 503, 175, 53);
		contentPane.add(btnNewButton_1);
		

		JButton btnNewButton_2 = new JButton("Servir Comandas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				modeloLista.clear();
				modeloLista2.clear();
				cola.add(new Comanda("Mesa 1", 2, 75.0,"Preparando"));
		        cola.add(new Comanda("Mesa 2", 1, 60.0, "Preparando" ));
		        cola.add(new Comanda("Mesa 3", 3, 85.75, "Preparando"));
	            cola.add(new Comanda("Mesa 4", 4, 70.0, "Preparando"));
	            cola.add(new Comanda("Mesa 5", 2, 95.5, "Preparando"));
	    		cola.add(new Comanda("Mesa 6", 3, 100.0, "Preparando"));
	    		cola.add(new Comanda("Mesa 7", 1, 77.5, "Preparando"));
	    		cola.add(new Comanda("Mesa 8", 4, 86.8, "Preparando"));
	    		cola.add(new Comanda("Mesa 9", 2, 90.0, "Preparando"));
	    		cola.add(new Comanda("Mesa 10", 3, 105.25, "Preparando"));
	    		cola.add(new Comanda("Mesa 11", 1, 67.8, "Preparando"));
	    		cola.add(new Comanda("Mesa 12", 4, 110.0, "Preparando"));
	    		cola.add(new Comanda("Mesa 13", 2, 81.5, "Preparando"));
	    	    cola.add(new Comanda("Mesa 14", 3, 98.75, "Preparando"));
	    	    cola.add(new Comanda("Mesa 15", 1, 84.0, "Preparando"));
	    					    		

				
				while (!cola.isEmpty()) {
					Comanda comanda = cola.remove();
					if (comanda.getEstado().equals("Preparando")) {
						comanda.setEstado("Servidas");
					}
					modeloLista3.addElement("Nombre:" + comanda.getNombre()+"-Estado:" + comanda.getEstado() +"\n");
					modeloLista3.addElement("----------");
					
				}
				 JOptionPane.showMessageDialog(null, "Las comandas han sido servidas");
			}
		});

		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Impact", Font.ITALIC, 15));
		btnNewButton_2.setBounds(785, 503, 175, 53);
		contentPane.add(btnNewButton_2);
		
		JList list = new JList(modeloLista);
		list.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		list.setBounds(10, 87, 481, 405);
		contentPane.add(list);
		
		JList list2 = new JList(modeloLista2);
		list2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		list2.setBounds(501, 87, 232, 405);
		contentPane.add(list2);
	}
}
