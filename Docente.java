package ec.edu.uce.grupo1;

/**
 * Clase que representa a un Docente en el S.U
 * 
 * @author Lenin
 * @version 1.0
 */
public class Docente extends Persona {

	protected static final double BONOPOSGRADO = 100.0;
	protected double salario;
	protected boolean tienePosgrado;

	/**
	 * 
	 * @param cedula        Documento de identificacion (10 digitos)
	 * @param nombre        Nombre del Docente
	 * @param correo        Correo institucional del Docente
	 * @param rol           Rol de Docente dentro del S.U
	 * @param departamento  Departamento del Docente dentro del S.U
	 * @param salario       Salario remunerado que recibe el docente
	 * @param tienePosgrado Verificador si el Docente esta estudiando un posgrado
	 */
	public Docente(String cedula, String nombre, String correo, RolPersona rol, Departamento departamento,
			double salario, boolean tienePosgrado) {

		super(cedula, nombre, correo, rol, departamento);
		this.salario = salario;
		this.tienePosgrado = tienePosgrado;

	}
	/**
	 * Constructor corto del Docente que invoca al metodo largo
	 * @param cedula Documento de identificacion (10 digitos)
	 * @param nombre Nombre del Docente
	 */
	public Docente (String cedula, String nombre) {
		this(cedula, nombre, "Sin Correo", RolPersona.DOCENTE, Departamento.SIN_DEPARTAMENTO, 460.00, false);
	}

	/**
	 * Metodo que calcula el salario del Docente
	 */
	@Override
	public double calcularPago() {
		if (this.tienePosgrado) {
			return this.salario + BONOPOSGRADO;
		} else {
			return this.salario;
		}
	}

	/**
	 * Metodo ToString que retorna la informacion de la clase
	 */
	@Override
	public String toString() {
		return super.toString() + "Docente [salario=" + salario + ", tienePosgrado=" + tienePosgrado + "]";
	}

	/**
	 * @return Retorna el salario del Docente
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario Modifica el salario del Docente
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return Retorna Verdadero o Falso si el Docente estudia un Posgrado
	 */
	public boolean getTienePosgrado() {
		return tienePosgrado;
	}

	/**
	 * @param tienePosgrado Modifica la condicion si el Docente estudia un Posgrado
	 */
	public void setTienePosgrado(boolean tienePosgrado) {
		this.tienePosgrado = tienePosgrado;
	}

}
