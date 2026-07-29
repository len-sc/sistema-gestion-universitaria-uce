package ec.edu.uce.grupo1;

/**
 * Clase que define a una persona dentro del S.U
 * 
 * @author Lenin
 * @version 1.0
 */
public class Persona {
	protected String cedula;
	protected String nombre;
	protected String correo;
	protected RolPersona rol;
	protected Departamento departamento;

	/**
	 * @param cedula       Documento de identificacion (10 digitos)
	 * @param nombre       Nombre de la persona
	 * @param correo       Correo institucional de la persona
	 * @param rol          Rol de la persona dentro del S.U
	 * @param departamento Departamento de la persona dentro del S.U
	 */
	public Persona(String cedula, String nombre, String correo, RolPersona rol, Departamento departamento) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.correo = correo;
		this.rol = rol;
		this.departamento = departamento;
	}

	/**
	 * Metodo que calcula el salario de una persona
	 * @return El pago de la persona
	 */
	public double calcularPago() {
		return 0;
	}



	/**
	 * @return Retorna los datos de la persona
	 */
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", rol=" + rol
				+ ", departamento=" + departamento + "]";
	}

	/**
	 * Metodo que retorna la cedula de la persona
	 * @return El numero de cedula de la persona
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * Metodo que modifica la cedula de la persona
	 * @param cedula El nuevo numero de cedula
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * Metodo que retorna el nombre de la persona
	 * @return El nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que cambia el nombre de la persona
	 * @param nombre El nuevo nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que retorna el correo de la persona
	 * @return El correo de la persona
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Metodo que cambia el correo de la persona
	 * @param correo El nuevo correo de la persona
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Metodo que retorna el rol de la persona
	 * @return El rol de la persona dentro de S.U
	 */
	public RolPersona getRol() {
		return rol;
	}

	/**
	 * Metodo que cambia el rol de la persona
	 * @param rol Nuevo rol de la persona
	 */
	public void setRol(RolPersona rol) {
		this.rol = rol;
	}

	/**
	 * Metodo que retorna el departamento
	 * @return El departamento al que pertenece la persona
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * Metodo que cambia el departamento de la persona
	 * @param departamento Nuevo departamento de la persona
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
