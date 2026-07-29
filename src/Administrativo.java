
package ec.edu.uce.grupo1;

/**
 * Clase que describe a un Administrativo que hereda de Persona
 * 
 * @author Lenin
 * @version 1.0
 */
public class Administrativo extends Persona {

	private double salario;
	private double horasExtra;

	/**
	 * Constructor Largo del Admin
	 * @param cedula       Documento de identificacion (10 digitos)
	 * @param nombre       Nombre del Admin
	 * @param correo       Correo institucional del Admin
	 * @param rol          Rol del Admin dentro del S.U
	 * @param departamento Departamento del Admin dentro del S.U
	 * @param salario      Remuneracion que recibe el Admin
	 * @param horasExtra   Horas extra de trabajo del Admin
	 */
	public Administrativo(String cedula, String nombre, String correo, RolPersona rol, Departamento departamento,
			double salario, double horasExtra) {
		super(cedula, nombre, correo, rol, departamento);
		this.salario = salario;
		this.horasExtra = horasExtra;

	}
	/**
	 * Constructor corto del Admin que invoca al metodo largo
	 * @param cedula Documento de identificacion (10 digitos)
	 * @param nombre Nombre del Admin
	 */
	public Administrativo(String cedula, String nombre) {
		this(cedula, nombre, "Sin correo", RolPersona.ADMINISTRATIVO, Departamento.SIN_DEPARTAMENTO, 460.00, 0);
	}

	
	/**
	 * Metodo que calcula el pago del administrativo
	 * @return Retorna el salario
	 */

	@Override
	public double calcularPago() {
		double valorHoraNormal = salario / 240;
		double valorHoraExtra = valorHoraNormal * 2.0;
		return this.salario + (this.horasExtra * valorHoraExtra);

	}

	/**
	 * @return Retorna la informacion del Administrativo
	 */
	@Override
	public String toString() {
		return super.toString() + "Administrativo [salario=" + salario + ", horasExtra=" + horasExtra + "]";
	}

	/**
	 * 
	 * @return Retorna el Salario del Admin
	 */
	public double getSalario() {
		return this.salario;
	}

	/**
	 * 
	 * @param salario Modifica el Salario del Admin
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return Retorna las horas extra del admin
	 */
	public double getHorasExtra() {
		return horasExtra;
	}

	/**
	 * @param horasExtra Cambia las horas extra del admin
	 */
	public void setHorasExtra(double horasExtra) {
		this.horasExtra = horasExtra;
	}


}
