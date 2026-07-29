
package ec.edu.uce.grupo1;

/**
 * Clase que representa a un Estudiante, hereda de Persona
 * 
 * @author Lenin
 * @version 1.0
 */
public class Estudiante extends Persona {

	private String numMatricula;
	private int semestre;
	private double promedio;

	/**
	 * Constructor largo del estudiante
	 * @param cedula       Documento de identificacion (10 digitos)
	 * @param nombre       Nombre del Estudiante
	 * @param correo       Correo institucional del Estudiante
	 * @param rol          Rol del Estudiante dentro del S.U
	 * @param numMatricula Numero de Matricula del Estudiante
	 * @param carrera      Carrera a la que pertenece el Estudiante
	 * @param semestre     Numero de semestre al que pertenece el Estudiante
	 * @param promedio     Promedio de notas del Estudiante
	 */

	public Estudiante(String cedula, String nombre, String correo, RolPersona rol, String numMatricula,
			Departamento carrera, int semestre, double promedio) {

		super(cedula, nombre, correo, rol, carrera);
		this.numMatricula = numMatricula;
		this.semestre = semestre;
		this.promedio = promedio;

	}
	
	/**
	 * Constructor corto que invoca al constructor largo del estudiante
	 * @param cedula       Documento de identificacion (10 digitos)
	 * @param nombre       Nombre del Estudiante
	 */
	public Estudiante(String cedula, String nombre) {
		this(cedula, nombre, "Sin correo", RolPersona.ESTUDIANTE, "00000", Departamento.SIN_DEPARTAMENTO, 0, 0.0);

	}

	/**
	 * Metodo que retorna el pago a un estudiante (0.0)
	 */
	@Override
	public double calcularPago() {
		return 0.0;
	}

	/**
	 * Metodo que define el Estado Academico del estudiante
	 */
	public void estadoAcademico() {
		if (this.promedio >= 13.5) {
			System.out.println("APROBADO");

		} else if (this.promedio >= 9.16) {
			System.out.println("SUPLETORIO");
		} else {
			System.out.println("REPROBADO");
		}

	}

	/**
	 * Metodo ToString
	 */
	@Override
	public String toString() {
		return super.toString() + "Estudiante [numMatricula=" + numMatricula + ", semestre="
				+ semestre + ", promedio=" + promedio + "]";
	}

	/**
	 * @return Retorna el numero de matricula del estudiante
	 */
	public String getNumMatricula() {
		return numMatricula;
	}

	/**
	 * @param numMatricula El nuevo numero de matricula del estudiante
	 */
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public int getSemestre() {
		return semestre;
	}

	/**
	 * @param semestre Cambia el semestre del estudiante
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	/**
	 * @return Retorna el promedio del estudiante
	 */
	public double getPromedio() {
		return promedio;
	}

	/**
	 * @param promedio Cambia el promedio del estudiante
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

}
