package co.edu.unbosque.controlador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import co.edu.unbosque.modelo.PersonaDAOImpl;
import co.edu.unbosque.modelo.PersonaDTO;
import co.edu.unbosque.modelo.persistencia.FileHandler;
import co.edu.unbosque.vista.VentanaLista;
import co.edu.unbosque.vista.VentanaMain;

/**
 * Esta clase hace la funcion de Controlador sivmendo los principios "GRASP"
 * 
 * @author Valentina Becerra Sastoque
 */
public class Controlador implements ActionListener {

	/**
	 * Declarar frame de la ventana principal
	 */
	private VentanaMain vm;
	/**
	 * Declarar frame de la ventana lista
	 */
	private VentanaLista vl;
	/**
	 * Lista que almacenara datos de tipo "PersonaDTO"
	 */
	private ArrayList<PersonaDTO> modelop;
	private PersonaDAOImpl pd;

	public Controlador() {
		vm = new VentanaMain();
		vl = new VentanaLista();
		modelop = new ArrayList<PersonaDTO>();
		pd = new PersonaDAOImpl();
	}

	/**
	 * Action listener y action command que asignan acciones
	 */
	public void iniciar() {
		vm.getBtn1().addActionListener(this);
//		vm.getBtn1().setActionCommand("Crear");

		vm.getBtn2().addActionListener(this);
//		vm.getBtn2().setActionCommand("Eliminar");

		vm.getBtn3().addActionListener(this);
//		vm.getBtn3().setActionCommand("Listar");

		vm.getBtn4().addActionListener(this);
//		vm.getBtn4().setActionCommand("Actualizar");

		vm.setVisible(true);
	}

	public void mostrarDatosP() {
		String datos = "";
		for (int i = 0; i < modelop.size(); i++) {
			datos = " • Nombre: " + modelop.get(i).getnombre() + "   • Apellido: " + modelop.get(i).getapellido()
					+ "  • Cedula: " + modelop.get(i).getcedula() + " • Edad: " + modelop.get(i).getedad()
					+ "  • Cargo: " + modelop.get(i).getcargo();
			vl.getP().add(new JLabel(datos));
			;
		}

		int alto = 70;
		for (JLabel jlabelp : vl.getP()) {
			jlabelp.setBounds(50, alto, 570, 40);
			jlabelp.setFont(new Font("Bebas Neue", 0, 16));
			jlabelp.setVisible(true);
			vl.add(jlabelp);
			alto += 25;
		}
	}

	public void crear(String nombre, String apellido, long cedula, int edad, String cargo) {
		PersonaDTO p = new PersonaDTO(nombre, apellido, cedula, edad, cargo);
		modelop.add(p);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("Listar")) {
			String nombre = "";
			String apellido = "";
			String cargo = "";
			int edad = 0;
			long cedula = 0;

			vl = new VentanaLista();
			mostrarDatosP();
			vl.setVisible(true);
		}

		if (comando.equals("Crear")) {
			if (verificar() == true) {
				String nombre = vm.getnombre().getText();
				String apellido = vm.getapellido().getText();
				String edadst = vm.getedad().getText();
				String cedulast = vm.getcedula().getText();
				String cargo = vm.getcargo().getText();
				if (verificar_num(nombre) == true | (verificar_num(apellido) | (verificar_num(cargo)))) {
					JOptionPane.showMessageDialog(null, "Revise que nombre, apellido y/o cargo no tengan numeros");
				} else {
					if (verificar_solonum(cedulast) == true && verificar_solonum(edadst) == true) {
						int cedula = Integer.parseInt((String) cedulast);
						int edad = Integer.parseInt((String) edadst);
						pd.crear(nombre, apellido, cedula, edad, cargo);
						JOptionPane.showMessageDialog(null, "Usuario Agregado exitosamente");
					} else {
						JOptionPane.showMessageDialog(null,
								" edad y cedula solo pueden contener caracteres numericos");
					}

				}
			}

			if (comando.equals("Eliminar")) {
				if (vm.getcedula().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Ingrese un numero de cedula");
				} else {
					int cedula = Integer.parseInt((String) vm.getcedula().getText());
					JOptionPane.showInputDialog(pd.eliminar(cedula));
				}
			}
		}

		if (comando.equals("Actualizar"))

		{
			if (verificar() == true) {
				String nombre = vm.getnombre().getText();
				String apellido = vm.getapellido().getText();
				String edadst = vm.getedad().getText();
				String cedulast = vm.getcedula().getText();
				String cargo = vm.getcedula().getText();
				if (verificar_num(nombre) == true | (verificar_num(apellido) | (verificar_num(cargo)))) {
					JOptionPane.showMessageDialog(null, "Revise que nombre, apellido y/o cargo no contegan ningun caracter numerico");
				} else {
					if (verificar_solonum(edadst) == true && verificar_solonum(cedulast) == true) {
						int edad = Integer.parseInt((String) edadst);
						int cedula = Integer.parseInt((String) cedulast);
						JOptionPane.showInputDialog(pd.actualizar(nombre, apellido, edad, cedula, cargo));
					} else {
						JOptionPane.showMessageDialog(null, " edad y cedula solo pueden contener caracteres numericos");
					}
				}
			}
		}
	}

	public boolean verificar() {
		boolean confirmar = false;
		if (vm.getnombre().getText().equals("") | vm.getapellido().getText().equals("")
				| vm.getcedula().getText().equals("") | vm.getedad().getText().equals("")
				| vm.getcedula().getText().equals("")) {
			confirmar = false;
		} else {
			confirmar = true;
		}
		if (confirmar == false) {
			JOptionPane.showMessageDialog(null, "Digite toda la información ");
		}
		return confirmar;

	}

	public boolean verificar_num(String str) {
		return str.matches(".*\\d+.*");

	}

	public boolean verificar_solonum(String str) {
		return str.matches("^\\d+$");
	}
}
