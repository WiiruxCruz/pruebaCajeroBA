import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		String entrada = null;
		System.out.println("Ingrese el n�mero:");
		while( s.hasNext() ) {
			
			entrada = s.nextLine();
			try {
				int numero = Integer.parseInt(entrada);
				
				int contador = 2;
				boolean primo = true;
				while( (primo) && (contador < numero) ) {
					if( numero % contador == 0)
						primo = false;
					
					contador++;
				}
				
				if(primo) {
					System.out.println("El numero " + numero + " es primo");
				} else {
					System.out.println("El numero " + numero + " NO es primo");
				}
				
			} catch(Exception e) {
				System.out.println("Por favor ingrese un n�mero!!");
			}
			
			System.out.println("Ingrese el n�mero:");
		}
	}
}
