package ec.edu.uce.grupo1;

/**
 * Clase que contiene la logica de los menus e instancias de las personas
 * 
 * @author Lenin
 * @version 1.0
 */
public class Universidad {

	private String nombre;

	private Estudiante estudiante;
	private Docente docente;
	private DocenteInvestigador investigador;
	private Administrativo administrativo;

	/**
	 * 
	 * @param nombre Recibe el nombre de la Universidad
	 */
	public Universidad(String nombre) {
		this.nombre = nombre;

		this.estudiante = null;
		this.docente = null;
		this.investigador = null;
		this.administrativo = null;
	}

	/**
	 * Metodo para ingresar estudiante
	 * 
	 * @param est Recibe un objeto del tipo estudiante
	 */
	public void ingresarPersona(Estudiante est) {
		this.estudiante = est;
		System.out.println("Estudiante ingresado con exito");
	}

	/**
	 * Metodo para ingresar Docente
	 * 
	 * @param doc Recibe un objeto de tipo docente
	 */
	public void ingresarPersona(Docente doc) {
		this.docente = doc;
		System.out.println("Docente ingresado con exito");
	}

	/**
	 * Metodo para ingresar Docente Investigador
	 * 
	 * @param doc Recibe un objeto de tipo docente investigador
	 */
	public void ingresarPersona(DocenteInvestigador inv) {
		this.investigador = inv;
		System.out.println("Docente Investigador ingresado con exito");
	}

	/**
	 * Metodo para ingresar un Administrativo
	 * 
	 * @param doc Recibe un objeto de tipo administrativo
	 */
	public void ingresarPersona(Administrativo admin) {
		this.administrativo = admin;
		System.out.println("Administrativo ingresado con exito");
	}

	/**
	 * Metodo para listar a todas las personas que se encuentren en el S.U
	 */
	public void listarTodo() {
		System.out.println("--- REGISTROS ACTUALES EN LA " + this.nombre.toUpperCase() + "---");
		if (this.estudiante != null)
			System.out.println(this.estudiante);
		if (this.docente != null)
			System.out.println(this.docente);
		if (this.investigador != null)
			System.out.println(this.investigador);
		if (this.administrativo != null)
			System.out.println(this.administrativo);

		if (estudiante == null && docente == null && investigador == null && administrativo == null)
			System.out.println("El sistema esta vacio");
		
	}
	
	/**
	 * Metodo para listar por los roles del S.U
	 * @param rolFiltro Recibe como parametro un rol para filtrar
	 */
	public void listarPorRol(RolPersona rolFiltro) {
		System.out.println("--- REGISTROS CON ROL " + rolFiltro + "---");
		boolean encontrar = false;
		if (this.estudiante != null && this.estudiante.getRol() == rolFiltro) {
			System.out.println(this.estudiante);
			encontrar = true;
		}
		if (this.docente != null && this.docente.getRol() == rolFiltro) {
			System.out.println(this.docente);
			encontrar = true;
		}
		if (this.investigador != null && this.investigador.getRol() == rolFiltro) {
			System.out.println(this.investigador);
			encontrar = true;
		}
		if (this.administrativo != null && this.administrativo.getRol() == rolFiltro) {
			System.out.println(this.administrativo);
			encontrar = true;
		}
		if (!encontrar) {
			System.out.println("No hay ninguna persona registrada con ese rol");
		}
	}
	
	/**
	 * Metodo que lista por departamento a cada persona
	 * @param filtroDepart Recibe el Departamento que se va a listar 
	 */
	public void listarPorDepartamento(Departamento filtroDepart) {
		System.out.println("--- REGISTROS CON DEPARTAMENTO " + filtroDepart + "---");
		boolean encontrar = false;
		if (this.estudiante != null && this.estudiante.getDepartamento() == filtroDepart) {
			System.out.println(this.estudiante);
			encontrar = true;
		}
		if (this.docente != null && this.docente.getDepartamento() == filtroDepart) {
			System.out.println(this.docente);
			encontrar = true;
		}
		if (this.investigador != null && this.investigador.getDepartamento() == filtroDepart) {
			System.out.println(this.investigador);
			encontrar = true;
		}
		if (this.administrativo != null && this.administrativo.getDepartamento() == filtroDepart) {
			System.out.println(this.administrativo);
			encontrar = true;
		}
		if (!encontrar) {
			System.out.println("No hay ninguna persona registrada con ese departamento");
		}
	}
	

	/**
	 * 
	 * @param cedula Recibe la cedula como parametro para buscar a la persona
	 * @return retorna la persona que coincida con la cedula, si no existe le avisa
	 *         al usuario
	 */
	public Persona buscar(String cedula) {
		if (this.estudiante != null && this.estudiante.getCedula().equals(cedula)) {
			return this.estudiante;
		}

		if (this.docente != null && this.docente.getCedula().equals(cedula)) {
			return this.docente;
		}

		if (this.investigador != null && this.investigador.getCedula().equals(cedula)) {
			return this.investigador;
		}
		if (this.administrativo != null && this.administrativo.getCedula().equals(cedula)) {
			return this.administrativo;
		}
		return null;
	}

	/**
	 * 
	 * @return El total de los gastos de la Universidad
	 */
	public double calcularNomina() {
		double total = 0.0;

		if (this.estudiante != null)
			total += this.estudiante.calcularPago();
		if (this.docente != null)
			total += this.docente.calcularPago();
		if (this.investigador != null)
			total += this.investigador.calcularPago();
		if (this.administrativo != null)
			total += this.administrativo.calcularPago();

		return total;
	}

	/**
	 * @return El nombre de la Universidad
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Cambia el nombre de la universidad
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
