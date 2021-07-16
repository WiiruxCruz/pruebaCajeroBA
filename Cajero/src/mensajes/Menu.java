package mensajes;

import Accion.Accion;
import Constantes.Constantes;
import Entity.CuentaBancaria;

public class Menu {
	public Menu() {}
	
	public void imprimirMenu() {
		System.out.println("Bienvenido usuario, por favor seleccione una de las siguientes opciones:");
		System.out.println("1. Consulta de saldo");
		System.out.println("2. Depositar saldo");
		System.out.println("3. Retirar dinero");
		System.out.print("Ingrese su opción:");
	}
	
	public Accion validacionMenu(String input) {
		boolean salida = false;
		int opcion = 0;
		
		Accion accion = new Accion();
		
		if(input != null) {
			try {
				opcion = Integer.parseInt(input);
			} catch(Exception e) {
				System.out.println("Por favor ingrese una opción del menú");
			}
			
			if(opcion > 0 && opcion < 4) {
				salida = true;
			}
		}
		
		accion.setIdAccion(opcion);
		accion.setValido(salida);
		//accion.setMensaje(mensaje);
		
		return accion;
	}
	/*
	public void imprimirMenuId(int opcion, CuentaBancaria cb) {
		Accion a = new Accion();
		switch(opcion) {
			case Constantes.OPCION_CONSULTA_SALDO:
				a.consultarSaldo(cb);
				break;
			case Constantes.OPCION_DEPOSITAR_SALDO:
				System.out.println("Ingrese la cantidad a depositar:");
				break;
			case Constantes.OPCION_RETIRAR_SALDO:
				//a.retirarSaldo(cb, monto);
				break;
			default:
				
		}
	}
	*/
	
	public boolean validarNumero(String s) {
		boolean salida = false;
		try {
			Integer.parseInt(s);
			salida = true;
		} catch(Exception e) {
			System.out.println("Hubo un error con el monto");
		}
		
		return salida;
	}
}
