package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class VentanaLista extends JFrame{
	
	private ArrayList<JLabel>p;


	public ArrayList<JLabel> getP() {
		return p;
	}

	public void setP(ArrayList<JLabel> p) {
		this.p = p;
	}
	
	public VentanaLista() {
		p = new ArrayList<>();
		
		setSize(50, 500);
		setLocationRelativeTo(null);
		Color ventanaColor = new Color(214, 255, 241);
		getContentPane().setBackground(ventanaColor);
		setLayout(null);
		setTitle("Personas registradas");
		setResizable(false);
		
		p = new ArrayList<>();
		
		setSize(800, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Personas Registradas");
//		getContentPane().setBackground(VentanaPColor);
		setResizable(false);
		setPreferredSize(new Dimension(550,800));
		
		JScrollBar scroll2 = new JScrollBar();
		scroll2.setBounds(765,0,20,575);

		JLabel titulo2 = new JLabel("Personas registradas");
		titulo2.setBounds(290, 30, 220, 40);
		titulo2.setFont(new Font("Bebas Neue", Font.BOLD, 20));
		titulo2.setVisible(true);

		add(scroll2);
		add(titulo2);
	}
}
