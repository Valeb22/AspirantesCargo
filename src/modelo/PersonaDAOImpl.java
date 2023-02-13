package co.edu.unbosque.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Esta clase hace la funcion de implementar el DAO
 * 
 * @author Valentina Becerra Sastoque
 */

import co.edu.unbosque.modelo.persistencia.FileHandler;

public class PersonaDAOImpl implements PersonaDAO {
	private ArrayList<PersonaDTO> lista;

	public PersonaDAOImpl() {
		lista = new ArrayList<>();
		//loadSerializable();
	}

	private void loadSerializable() {
		Object aux = FileHandler.readSerializable("aspirantes.dat");
		lista = (ArrayList<PersonaDTO>) aux;
	}

	public void crear(String nombre, String apellido, long cedula, int edad,  String cargo) {
		PersonaDTO aux = new PersonaDTO(nombre, apellido, cedula, edad, cargo);
		lista.add(aux);
		FileHandler.writeSerializable(lista, "aspirantes.dat");
	}

	@Override
	public String actualizar(String nombre, String apellido, long cedula, int edad, String cargo) {
		String res = "";
		boolean encontrado = false;
		for (PersonaDTO s : lista) {
			if (cedula == s.getcedula()) {
				s.setnombre(nombre);
				s.setapellido(apellido);
				s.setEdad(edad);
				s.setcargo(cargo);
				encontrado = true;
			}
		}
		if (encontrado == true) {
			res = "Persona editada!";
		} else {
			res = "Persona no encontrada";
		}
		FileHandler.writeSerializable(lista, "aspirantes.dat");
		return res;
	}

	@Override
	public String eliminar(long cedula) {
		String res = "";
		List<PersonaDTO> elementosAEliminar = new ArrayList<>();
		for (PersonaDTO s : lista) {
			if (cedula == s.getcedula()) {
				elementosAEliminar.add(s);
				res = "Usuario eliminado!";
			}
		}
		lista.removeAll(elementosAEliminar);
		if (res.isEmpty()) {
			res = "Usuario no encontrado";
		}
		FileHandler.writeSerializable(lista, "aspirantes.dat");
		return res;
	}

	@Override
	public String mostrarTodo() {
		String res = "";
		for (PersonaDTO s : lista) {
			res += " • Nombre: " + s.getnombre() + "   • Apellido: " + s.getapellido()
					+ "  • Cedula: " + s.getcedula() + " • Edad: " +s.getedad()
					+ "  • Cargo: " + s.getcargo();

		}
		return res;
			
	}
}