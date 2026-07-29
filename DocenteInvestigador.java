
package ec.edu.uce.grupo1;

/**
 * Clase que define a un Docente Investigador que hereda de Docente
 * 
 * @author Lenin
 * @version 1.0
 */
public class DocenteInvestigador extends Docente {

	private static final double BONOPORPUBLICACION = 300.0;
	private int numPublicaciones;

	/**
	 * Constructor largo de Docente Investigador
	 * 
	 * @param cedula           Documento de identificacion (10 digitos)
	 * @param nombre           Nombre del Docente
	 * @param correo           Correo institucional del Docente
	 * @param rol              Rol de Docente dentro del S.U
	 * @param departamento     Departamento del Docente dentro del S.U
	 * @param salario          Salario remunerado que recibe el docente
	 * @param tienePosgrado    Verificador si el Docente esta estudiando un posgrado
	 * @param numPublicaciones Numero de publicaciones del D. Investigador
	 */
	public DocenteInvestigador(String cedula, String nombre, String correo, RolPersona rol, Departamento departamento,
			double salario, boolean tienePosgrado, int numPublicaciones) {
		super(cedula, nombre, correo, rol, departamento, salario, tienePosgrado);
		this.numPublicaciones = numPublicaciones;
	}

	/**
	 * Constructor corto para el docente investigador que invoca al constructor largo
	 * @param cedula Documento de identificacion (10 digitos)
	 * @param nombre Nombre del Docente
	 */
	public DocenteInvestigador(String cedula, String nombre) {
		this(cedula, nombre, "Sin correo", RolPersona.INVESTIGADOR, Departamento.SIN_DEPARTAMENTO, 0.0, false, 0);
	}

	/**
	 * Metodo para calcular el pago del docente investigador, invoca al metodo de la
	 * clase padre y suma Bono
	 * 
	 */
	@Override
	public double calcularPago() {
		return super.calcularPago() + (this.numPublicaciones * BONOPORPUBLICACION);
	}

	/**
	 * Metodo que retorna la info del docente investigador
	 */
	@Override
	public String toString() {
		return super.toString() + "DocenteInvestigador [numPublicaciones=" + numPublicaciones + "]";
	}

	/**
	 * @return Retorna el numero de publicaciones
	 */
	public int getNumPublicaciones() {
		return numPublicaciones;
	}

	/**
	 * @param Modifica el numero de publicaciones
	 */
	public void setNumPublicaciones(int numPublicaciones) {
		this.numPublicaciones = numPublicaciones;
	}

}
