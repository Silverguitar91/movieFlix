/**
 * 
 * Fecha: 16/03/2021
* 
* @author Andrei y Mar�a
* 
* @version 1.0
* 
* Clase GestorUsuarios
* 
* Se implementan los m�todos del gestor
* 
*/

package servicios;

import datos.MapaUsuarios;

public class GestorUsuarios implements Gestor {

	private MapaUsuarios usuarios = new MapaUsuarios();

	public void listarUsuarios() {
		this.usuarios.listarUsuarios();
	}

	public void addUsuarios() {

		this.usuarios.addUsuarios();
	}

	public void eliminarUsuarios() {
		this.usuarios.eliminarUsuarios();
	}

	public void modificarUsuarios() {
		this.usuarios.modificarUsuarios();
	}

}
