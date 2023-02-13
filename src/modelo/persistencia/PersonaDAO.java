package co.edu.unbosque.modelo;

public interface PersonaDAO {
	
	/**
	 * Cumpliendo con la funcion de "Data Access object (DAO)" contiene el CRUD de
	 * persona
	 * 
	 * @author Valentina Becerra Sastoque
	 */

	public void crear(String nombre, String apellido, Long cedula, int edad, String cargo);
//	abstract String actualizar(String nombre, String apellido, int edad, long cedula, String cargo);
	abstract String eliminar(long cedula);
//	abstract String mostrarUno(long cedula);
	abstract String mostrarTodo();
	String actualizar(String nombre, String apellido, long cedula, int edad, String cargo);
}
