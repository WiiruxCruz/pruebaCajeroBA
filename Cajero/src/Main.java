import java.util.Scanner;

import Accion.Accion;
import Constantes.Constantes;
import Entity.CuentaBancaria;
import mensajes.Menu;

public class Main {
	public static void main(String args[]) {
		Menu m = new Menu();
		Accion a = new Accion();
		CuentaBancaria cb = new CuentaBancaria();
		System.out.println("Hola mundo");
		Scanner s = new Scanner(System.in);
		String entrada = null;
		String monto = null;
		m.imprimirMenu();
		
		while( s.hasNext() ) {
			
			entrada = s.nextLine();
			a = m.validacionMenu(entrada);
			if( a.isValido() ) {
				entrada = s.nextLine();
				//m.imprimirMenuId(a.getIdAccion(), cb);
				switch( a.getIdAccion() ) {
					case Constantes.OPCION_CONSULTA_SALDO:
						a.consultarSaldo(cb);
						break;
					case Constantes.OPCION_DEPOSITAR_SALDO:
						System.out.println("Ingrese la cantidad a depositar:");
						monto = s.nextLine();
						if( m.validarNumero(monto) ) {
							int tmp = Integer.parseInt(monto);
							a.agregarSaldo(cb, tmp);
						}
						
						break;
					case Constantes.OPCION_RETIRAR_SALDO:
						System.out.println("Ingrese la cantidad a retirar:");
						monto = s.nextLine();
						if( m.validarNumero(monto) ) {
							int tmp = Integer.parseInt(monto);
							a.retirarSaldo(cb, tmp);
						}
						break;
				}
			}
			
			
				m.imprimirMenu();
			
			
		}
	}
}
