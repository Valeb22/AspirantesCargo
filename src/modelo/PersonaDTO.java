package co.edu.unbosque.modelo;

import java.io.Serializable;

public class PersonaDTO implements Serializable {

	private String nombre;
	private String apellido;
	private long cedula;
	private int edad;
	private String cargo;

	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(String nombre, String apellido, long cedula, int edad, String cargo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.cargo = cargo;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getapellido() {
		return apellido;
	}

	public void setapellido(String apellido) {
		this.apellido = apellido;
	}

	public long getcedula() {
		return cedula;
	}

	public void setcedula(long cedula) {
		this.cedula = cedula;
	}

	public int getedad() {
		return edad;
	}
	
	public int setedad() {
		return edad;
	}

	public String getcargo() {
		return cargo;
	}

	public void setcargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		String res = "";
		res += "Nombre: " + this.nombre + "," + "Apellido: " + "\n" + this.apellido + "," + "Cedula: " + this.cedula
				+ "," + "Edad: " + this.edad + "," + "\n" + "Cargo: " + this.cargo;
		return res;
	}

	public void setEdad(int edad2) {
		// TODO Auto-generated method stub
		
	}

}
