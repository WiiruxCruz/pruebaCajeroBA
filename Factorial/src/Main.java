import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		String entrada = null;
		Integer numero = null;
		
		while( sc.hasNext() ) {
			
			entrada = sc.nextLine();
			try {
				numero = Integer.parseInt(entrada);
				char primerCaracter = entrada.charAt(0);
				char ultimoDigito = entrada.charAt( entrada.length() - 1 );
				
				if(primerCaracter == '-') {
					int temp = numero * -1;
					if(
						ultimoDigito == '1'
						|| ultimoDigito == '3'
						|| ultimoDigito == '5'
						|| ultimoDigito == '7'
						|| ultimoDigito == '9'
					) {
						System.out.println("El factorial de " + numero + " es: -" + factorial(temp));
					} else {
						System.out.println("El factorial de " + numero + " es:" + factorial(temp));
					}
				} else {
					System.out.println("El factorial de " + numero + " es:" + factorial(numero));
				}
				
				
				
			} catch(Exception e) {
				System.out.println("Por favor ingrese un número");
			}
			
			//int num = sc.nextInt();
			//sc.close();
			System.out.println("Introduce un número:");
		}
		
		
	}
	
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		} else {
			return num*factorial(num-1);
		}
	}
}
