/*
 * 
 * Fecha: 22/03/2021
 * 
 * @author Edu
 * 
 * @version 1.0
 * 
 *          Clase Menu
 * 
 *          Clase que establece los men�s gr�fico de la aplicaci�n
 * 
 * 
 */

package gui;

import utilidades.Escritor;

public class Menu {

	public static void principal() {
		Escritor.str("\n********** MEN� PRINCIPAL **********\n");
		Escritor.str("1. Gestionar Usuarios");
		Escritor.str("2. Gestionar Pel�culas");
		Escritor.str("3. Salir del programa");
	}

	public static void usuarios() {
		Escritor.str("\n********** GESTI�N DE USUARIOS **********\n");
		Escritor.str("1. Listar todos los usuarios");
		Escritor.str("2. A�adir un usuario");
		Escritor.str("3. Eliminar un usuario");
		Escritor.str("4. Modificar un usuario");
		Escritor.str("5. Volver al men� principal");
	}

	public static void modificarUsuario() {
		Escritor.str("\n********** MODIFICAR USUARIO **********\n");
		Escritor.str("1. Nombre");
		Escritor.str("2. Ciudad de residencia");
		Escritor.str("3. Fecha de nacimiento");
	}

	public static void peliculas() {
		Escritor.str("\n********** GESTI�N DE PEL�CULAS **********\n");
		Escritor.str("1. Listar todas las pel�culas");
		Escritor.str("2. A�adir una pel�cula");
		Escritor.str("3. Eliminar una pel�cula");
		Escritor.str("4. Modificar una pel�cula");
		Escritor.str("5. Mostrar las pel�culas m�s valoradas");
		Escritor.str("6. Mostrar las pel�culas cuya valoraci�n est� por encima de la media");
		Escritor.str("7. Mostrar las pel�culas peor valoradas");
		Escritor.str("8. Mostrar las pel�culas m�s vistas");
		Escritor.str("9. Volver al men� principal");
	}

	public static void modificarPelicula() {
		Escritor.str("\n********** MODIFICAR PEL�CULA **********\n");
		Escritor.str("1. T�tulo");
		Escritor.str("2. A�o");
		Escritor.str("3. Categor�a");
	}

}
