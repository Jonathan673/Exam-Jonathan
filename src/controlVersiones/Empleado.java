package controlVersiones;

/**
 * @version 1, 2021
 * @author Jonathan
 * @since 24/05/2021
 */

public class Empleado {
	
	/**
	 * @param Definimos las variables correspondientes
	 * @param Creación del constructor
	 * @param Getters and setters
	 * @param metodo el cual sumará el valor de la variable subida a salario
	 */
	
//variables
	private String nombre;
	private String apellidos;
	private double salario;

//constructor
	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.salario = salario;
	}

//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
//metodo
	public void subirsalario(double subida) {
		salario = salario + subida;
	}

}