
package ec.edu.uce.grupo1;

import java.util.Scanner;

/**
 * Clase que contiene los menus interactivos, el acabado final del programa
 * 
 * @author Lenin
 * @version 1.0
 */
public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Universidad uni = new Universidad("Universidad Central del Ecuador");
		int opcion = 0;

		do {

			System.out.println("--------------------------------------------");
			System.out.println("           SISTEMA UNIVERSITARIO            ");
			System.out.println("--------------------------------------------");
			System.out.println(" ");
			System.out.println("1. Registrar Persona");
			System.out.println("2. Listar todo");
			System.out.println("3. Listar por rol");
			System.out.println("4. Listar por departamento");
			System.out.println("5. Buscar persona");
			System.out.println("6. Imprimir nomina");
			System.out.println("7. Salir");
			System.out.println("Seleccione una opcion: ");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("--- SUBMENÚ DE INGRESO DE PERSONAL ---");
				System.out.println("1. Estudiante ");
				System.out.println("2. Docente ");
				System.out.println("3. Docente Investigador ");
				System.out.println("4. Administrativo ");
				System.out.println("5. Regresar al menu principal ");
				System.out.print("Seleccione el tipo de persona a ingresar: ");
				int subTipo = sc.nextInt();
				sc.nextLine();

				
				switch (subTipo) {
				case 1:

					System.out.println("Ingrese el numero de cedula: ");
					String ced = sc.nextLine();
					System.out.println("Ingrese el nombre: ");
					String nom = sc.nextLine();
					System.out.println("Ingrese el correo: ");
					String corr = sc.nextLine();

					System.out.println("Ingrese el numero de matricula: ");
					String matr = sc.nextLine();
					System.out.println("Ingrese el semestre (numero): ");
					int sem = sc.nextInt();
					System.out.println("Ingrese el promedio: ");
					double prom = sc.nextDouble();
					sc.nextLine();

					System.out.println("Seleccione su Carrera:");
					System.out.println("1. ING_CIVIL");
					System.out.println("2. ING_COMPUTACION");
					System.out.println("3. ING_SISTEMAS_DE_INFORMACION");
					System.out.println("4. ING_DISEÑO_INDUSTRIAL");
					System.out.println("5. ING_MECANICA");
					System.out.print("Selección (1-5): ");
					int opCarrera = sc.nextInt();
					sc.nextLine();

					Departamento carreraElegida = Departamento.SIN_DEPARTAMENTO;
					if (opCarrera == 1)
						carreraElegida = Departamento.ING_CIVIL;
					if (opCarrera == 2)
						carreraElegida = Departamento.ING_COMPUTACION;
					if (opCarrera == 3)
						carreraElegida = Departamento.ING_SISTEMAS_DE_INFORMACION;
					if (opCarrera == 4)
						carreraElegida = Departamento.ING_DISEÑO_INDUSTRIAL;
					if (opCarrera == 5)
						carreraElegida = Departamento.ING_MECANICA;

					Estudiante est = new Estudiante(ced, nom, corr, RolPersona.ESTUDIANTE, matr, carreraElegida, sem,
							prom);
					uni.ingresarPersona(est);

					break;

				case 2:
					System.out.println("Ingrese el numero de cedula: ");
					String cedDoc = sc.nextLine();
					System.out.println("Ingrese el nombre: ");
					String nomDoc = sc.nextLine();
					System.out.println("Ingrese el correo: ");
					String corrDoc = sc.nextLine();

					System.out.println("Ingrese salario del docente: ");
					double salario = sc.nextDouble();
					System.out.println("¿Tiene Posgrado?");
					System.out.println("1. SI");
					System.out.println("2. NO");
					int eleccion = sc.nextInt();
					sc.nextLine();
					boolean posgrado = (eleccion == 1);

					System.out.println("Seleccione su Departamento:");
					System.out.println("1. ING_CIVIL");
					System.out.println("2. ING_COMPUTACION");
					System.out.println("3. ING_SISTEMAS_DE_INFORMACION");
					System.out.println("4. ING_DISEÑO_INDUSTRIAL");
					System.out.println("5. ING_MECANICA");
					System.out.print("Selección (1-5): ");
					int opDep = sc.nextInt();
					sc.nextLine();

					Departamento depElegido = Departamento.SIN_DEPARTAMENTO;
					if (opDep == 1)
						depElegido = Departamento.ING_CIVIL;
					if (opDep == 2)
						depElegido = Departamento.ING_COMPUTACION;
					if (opDep == 3)
						depElegido = Departamento.ING_SISTEMAS_DE_INFORMACION;
					if (opDep == 4)
						depElegido = Departamento.ING_DISEÑO_INDUSTRIAL;
					if (opDep == 5)
						depElegido = Departamento.ING_MECANICA;

					Docente docente = new Docente(cedDoc, nomDoc, corrDoc, RolPersona.DOCENTE, depElegido, salario,
							posgrado);
					uni.ingresarPersona(docente);
					break;

				case 3:
					System.out.println("Ingrese el numero de cedula: ");
					String cedInv = sc.nextLine();
					System.out.println("Ingrese el nombre: ");
					String nomInv = sc.nextLine();
					System.out.println("Ingrese el correo: ");
					String corrInv = sc.nextLine();

					System.out.println("Ingrese salario del docente investigador: ");
					double salarioinv = sc.nextDouble();
					System.out.println("¿Tiene Posgrado?");
					System.out.println("1. SI");
					System.out.println("2. NO");
					int eleccioninv = sc.nextInt();
					sc.nextLine();
					boolean posgradoinv = (eleccioninv == 1);

					System.out.println("Seleccione su Departamento:");
					System.out.println("1. ING_CIVIL");
					System.out.println("2. ING_COMPUTACION");
					System.out.println("3. ING_SISTEMAS_DE_INFORMACION");
					System.out.println("4. ING_DISEÑO_INDUSTRIAL");
					System.out.println("5. ING_MECANICA");
					System.out.print("Selección (1-5): ");
					int opDepinv = sc.nextInt();
					sc.nextLine();

					Departamento depElegidoinv = Departamento.SIN_DEPARTAMENTO;
					if (opDepinv == 1)
						depElegidoinv = Departamento.ING_CIVIL;
					if (opDepinv == 2)
						depElegidoinv = Departamento.ING_COMPUTACION;
					if (opDepinv == 3)
						depElegidoinv = Departamento.ING_SISTEMAS_DE_INFORMACION;
					if (opDepinv == 4)
						depElegidoinv = Departamento.ING_DISEÑO_INDUSTRIAL;
					if (opDepinv == 5)
						depElegidoinv = Departamento.ING_MECANICA;

					System.out.print("Numero de publicaciones del docente: ");
					int numPublic = sc.nextInt();
					sc.nextLine();

					DocenteInvestigador inv = new DocenteInvestigador(cedInv, nomInv, corrInv, RolPersona.INVESTIGADOR,
							depElegidoinv, salarioinv, posgradoinv, numPublic);
					uni.ingresarPersona(inv);
					break;
				case 4:

					System.out.println("Ingrese el numero de cedula: ");
					String cedAdmin = sc.nextLine();
					System.out.println("Ingrese el nombre: ");
					String nomAdmin = sc.nextLine();
					System.out.println("Ingrese el correo: ");
					String corrAdmin = sc.nextLine();

					System.out.println("Ingrese salario del administrativo: ");
					double salarioadmin = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese horas extra del administrativo: ");
					double horasExtra = sc.nextDouble();
					sc.nextLine();

					System.out.println("Seleccione su Departamento:");
					System.out.println("1. ING_CIVIL");
					System.out.println("2. ING_COMPUTACION");
					System.out.println("3. ING_SISTEMAS_DE_INFORMACION");
					System.out.println("4. ING_DISEÑO_INDUSTRIAL");
					System.out.println("5. ING_MECANICA");
					System.out.print("Selección (1-5): ");
					int opDepadmin = sc.nextInt();
					sc.nextLine();

					Departamento depElegidoadmin = Departamento.SIN_DEPARTAMENTO;
					if (opDepadmin == 1)
						depElegidoadmin = Departamento.ING_CIVIL;
					if (opDepadmin == 2)
						depElegidoadmin = Departamento.ING_COMPUTACION;
					if (opDepadmin == 3)
						depElegidoadmin = Departamento.ING_SISTEMAS_DE_INFORMACION;
					if (opDepadmin == 4)
						depElegidoadmin = Departamento.ING_DISEÑO_INDUSTRIAL;
					if (opDepadmin == 5)
						depElegidoadmin = Departamento.ING_MECANICA;
					Administrativo admin = new Administrativo(cedAdmin, nomAdmin, corrAdmin, RolPersona.ADMINISTRATIVO,
							depElegidoadmin, salarioadmin, horasExtra);

					uni.ingresarPersona(admin);
					break;

				default:
					System.out.println("Regresando...");
					break;
				}
				break;

			case 2:
				uni.listarTodo();
				break;
			case 3:
				System.out.println("--- SUBMENÚ DE LISTADO POR ROL ---");
				System.out.println("1. Estudiante ");
				System.out.println("2. Docente ");
				System.out.println("3. Docente Investigador ");
				System.out.println("4. Administrativo ");
				System.out.println("5. Regresar al menu principal ");
				System.out.print("Seleccione el tipo de rol a filtrar: ");
				int opRol = sc.nextInt();
				sc.nextLine();
				switch (opRol) {
				case 1:
					uni.listarPorRol(RolPersona.ESTUDIANTE);
					break;
				case 2:
					uni.listarPorRol(RolPersona.DOCENTE);
					break;
				case 3:
					uni.listarPorRol(RolPersona.INVESTIGADOR);
					break;
				case 4:
					uni.listarPorRol(RolPersona.ADMINISTRATIVO);
					break;
				default:
					System.out.println("Regresando...");
					break;
				}
				break;
			case 4:
				System.out.println("--- SUBMENÚ DE LISTADO POR DEPARTAMENTO ---");
				System.out.println("1. Ing. Civil ");
				System.out.println("2. Ing. Computacion");
				System.out.println("3. Ing. Sistemas de Informacion ");
				System.out.println("4. Ing. Diseño Industrial ");
				System.out.println("5. Ing. Mecanica ");
				System.out.println("6. Regresar al menu principal ");
				System.out.print("Seleccione el tipo de departamento a filtrar: ");
				int opDep = sc.nextInt();
				sc.nextLine();
				switch (opDep) {
				case 1:
					uni.listarPorDepartamento(Departamento.ING_CIVIL);
					break;
				case 2:
					uni.listarPorDepartamento(Departamento.ING_COMPUTACION);
					break;
				case 3:
					uni.listarPorDepartamento(Departamento.ING_SISTEMAS_DE_INFORMACION);
					break;
				case 4:
					uni.listarPorDepartamento(Departamento.ING_DISEÑO_INDUSTRIAL);
					break;
				case 5:
					uni.listarPorDepartamento(Departamento.ING_MECANICA);
					break;
				default:
					System.out.println("Regresando...");
					break;
				}
				break;
			case 5:
				System.out.println("--- BUSQUEDA DE PERSONAS POR CEDULA ---");
				System.out.println("Ingrese el numero de cedula a buscar: ");
				String cedulaBuscar = sc.nextLine();

				Persona encontrada = uni.buscar(cedulaBuscar);
				if (encontrada != null) {
					System.out.println("Persona Encontrada: ");
					System.out.println(encontrada);
					if (encontrada.getRol() == RolPersona.ESTUDIANTE) {
						Estudiante estEncontrado = (Estudiante) encontrada;
						System.out.println("Condicion Academica: ");
						estEncontrado.estadoAcademico();
					}
				} else {
					System.out.println("La cedula: " + cedulaBuscar + " no fue encontrada");
				}
				break;
			case 6: 
				System.out.println("--- NOMINA DE LA UNIVERSIDAD  ---");
				double totalNomina = uni.calcularNomina();
				
				System.out.println("El gasto total en sueldos del personal es: " + totalNomina);
				System.out.println("_______________________________________________________");
				break;
				
			case 7:
				System.out.println("GRACIAS POR USAR EL SISTEMA UNIVERSITARIO");
				System.out.println("SALIENDO...");
				break;
			}

		} while (opcion != 7);
		sc.close();

	}

}
