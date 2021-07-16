package Accion;
import Entity.CuentaBancaria;

public class Accion {
	private int idAccion;
	private boolean valido;
	private String mensaje;
	
	public Accion() {}
	
	public void consultarSaldo(CuentaBancaria cb) {
		System.out.println("Su saldo actual es: $" + cb.getSaldo());
	}
	
	public boolean agregarSaldo(CuentaBancaria cb, int monto) {
		
		boolean salida = false;
		
		if(monto < 0) {
			mensaje = "No puedes ingresar un numero negativo";
		} else if( monto < 20 ) {
			mensaje = "El monto minimo de deposito es de $20";
		} else if( monto > 5000) {
			mensaje = "El saldo maximo a ingresar es de 5000";
		} 
		/* 
		  else if ( monto % 20 != 0 || monto % 50 != 0 || monto % 70 != 0) {
			mensaje = "La cantidad a depositar solo puede agregarse en billetes multiplo de 20 o 50";
		}
		*/ 
		else {
			if(monto % 70 == 0) {
				//OK
				cb.setSaldo( cb.getSaldo() + monto );
				salida = true;
				mensaje = "Usted ha depositado la cantidad de:" + monto;
				consultarSaldo(cb);
			} else if( monto % 20 == 0) {
				//OK
				cb.setSaldo( cb.getSaldo() + monto );
				salida = true;
				mensaje = "Usted ha depositado la cantidad de:" + monto;
				consultarSaldo(cb);
			} else if( monto % 50 == 0) {
				//OK
				cb.setSaldo( cb.getSaldo() + monto );
				salida = true;
				mensaje = "Usted ha depositado la cantidad de:" + monto;
				consultarSaldo(cb);
			} else {
				int temporal = monto % 100;
				if(temporal % 70 == 0) {
					//OK
					cb.setSaldo( cb.getSaldo() + monto );
					salida = true;
					mensaje = "Usted ha depositado la cantidad de:" + monto;
					consultarSaldo(cb);
				} else {
					mensaje = "La cantidad a depositar solo puede agregarse en billetes multiplo de 20 o 50";
				}
				
			}
			
		}
		
		
		System.out.println(mensaje);
		return salida;
	}
	
	public boolean retirarSaldo(CuentaBancaria cb, int monto) {
		boolean salida = false;
		
		if(cb.getSaldo() == 0) {
			mensaje = "Para hacer un retiro primero ingresa saldo a tu cuenta";
		} else if( cb.getSaldo() - monto < 0) {
			mensaje = "Lo sentimos, el monto que intentas retirar es superior a tus fondos";
		} else {
			if( monto < 0 ) {
				mensaje = "No puedes retirar un numero negativo";
			} else if( monto < 50) {
				mensaje = "El monto minimo para retiro es $50";
			} else if( monto > 7500) {
				mensaje = "El monto es mayor del permitido para retiro $7500";
			} else if( monto % 50 != 0 ) {
				mensaje = "La cantidad a retirar solo puede entregarse en billetes multiplo de 50";
			} else {
				cb.setSaldo( cb.getSaldo() - monto);
				salida = true;
				mensaje = "Usted ha retirado la cantidad de:" + monto;
				consultarSaldo(cb);
			}
		}
		
		System.out.println(mensaje);
		
		
		
		return salida;
	}
	
	
	public int getIdAccion() {
		return idAccion;
	}
	public void setIdAccion(int idAccion) {
		this.idAccion = idAccion;
	}
	
	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
