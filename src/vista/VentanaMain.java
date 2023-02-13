package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaMain extends JFrame implements ActionListener {

	private JLabel nom, ape, eda, cedu, car;
	private JButton btn1, btn2, btn3, btn4;
	private JTextField nombre, apellido, cedula, edad, cargo;

	
	public VentanaMain() {

		setBounds(420, 70, 500, 500);
		setLayout(null);
		setResizable(false);
		Color ventanaColor = new Color(214, 255, 241 );
		getContentPane().setBackground(ventanaColor);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		nom = new JLabel("Nombre:");
		nom.setBounds(50, 40, 200, 20);
		nom.setFont(new Font("Bebas Neue", Font.BOLD, 20));
		nom.setVisible(true);

		ape = new JLabel("Apellido:");
		ape.setBounds(50, 85, 200, 20);
		ape.setFont(new Font("Bebas Neue", Font.BOLD, 20));
		ape.setVisible(true);

		cedu = new JLabel("Cedula:");
		cedu.setBounds(50, 134, 225, 20);
		cedu.setFont(new Font("Bebas Neue", Font.BOLD, 20));
		cedu.setVisible(true);

		eda = new JLabel("Edad:");
		eda.setBounds(50, 178, 250, 20);
		eda.setFont(new Font("Bebas Neue", Font.BOLD, 20));
		eda.setVisible(true);
		
		car = new JLabel("Cargo:");
		car.setBounds(50, 220, 225, 30);
		car.setFont(new Font("Bebas Neue", Font.BOLD, 19));
		car.setVisible(true);

		nombre = new JTextField();
		nombre.setBounds(210, 40, 200, 30);

		apellido = new JTextField();
		apellido.setBounds(210, 85, 200, 30);

		cedula = new JTextField();
		cedula.setBounds(210, 134, 200, 30);

		edad = new JTextField();
		edad.setBounds(210, 178, 200, 30);

		cargo = new JTextField();
		cargo.setBounds(210, 220, 200, 30);

		btn1 = new JButton("Crear");
		btn1.setBounds(20, 300, 210, 60);
		Color btn1color = new Color(220, 255, 184 );
		btn1.setBackground(btn1color);

		btn2 = new JButton("Eliminar");
		btn2.setBounds(255, 300, 210, 60);
		Color btn2color = new Color(234, 214, 255  );
		btn2.setBackground(btn2color);

		btn3 = new JButton("Listar");
		btn3.setBounds(20, 380, 210, 60);
		Color btn3color = new Color(255, 214, 254  );
		btn3.setBackground(btn3color);
		
		btn4 = new JButton("Actualizar");
		btn4.setBounds(255, 380, 210, 60);
		Color btn4color = new Color(255, 243, 164  );
		btn4.setBackground(btn4color);

		add(nom);
		add(ape);
		add(eda);
		add(cedu);
		add(car);
		add(nombre);
		add(apellido);
		add(cedula);
		add(edad);
		add(cargo);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public JLabel getnom() {
		return nom;
	}

	public void setnom(JLabel nom) {
		this.nom = nom;
	}

	public JLabel getape() {
		return ape;
	}

	public void setape(JLabel ape) {
		this.ape = ape;
	}

	public JLabel geteda() {
		return eda;
	}

	public void seteda(JLabel eda) {
		this.eda = eda;
	}

	public JLabel getcedu() {
		return cedu;
	}

	public void setcedu(JLabel cedu) {
		this.cedu = cedu;
	}

	public JLabel getcar() {
		return car;
	}

	public void setcar(JLabel car) {
		this.car = car;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}

	public JTextField getnombre() {
		return nombre;
	}

	public void setnombre(JTextField nombre) {
		nombre = nombre;
	}

	public JTextField getapellido() {
		return apellido;
	}

	public void setapellido(JTextField apellido) {
		apellido = apellido;
	}

	public JTextField getcedula() {
		return cedula;
	}

	public void setcedula(JTextField cedula) {
		cedula = cedula;
	}

	public JTextField getedad() {
		return edad;
	}

	public void setedad(JTextField edad) {
		edad = edad;
	}

	public JTextField getcargo() {
		return cargo;
	}

	public void setcargo(JTextField cargo) {
		cargo = cargo;
	}

}
