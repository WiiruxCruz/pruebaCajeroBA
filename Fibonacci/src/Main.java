import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ADVERTENCIA: No calcular la serie fibonacci para números muy altos");
		
		System.out.println("Ingrese el indice que desea calcular de la serie de fibonacci:");
		
		while( sc.hasNext() ) {
			
			String entrada = sc.nextLine();
			try {
				int numero = Integer.parseInt(entrada);
				
				int salida = fibonacci(numero);
				
				System.out.println("El número fibonacci de " + numero + " es:" + salida);
			} catch(Exception e) {
				System.out.println("Por favor ingrese un número");
			}
			
			System.out.println("Ingrese el indice que desea calcular de la serie de fibonacci:");
		}
	}
	
	
	public static int fibonacci(int numero) {
		if(numero == 1) {
			return 1;
		} else if( numero == 0 ) {
			return 0;
		} else if( numero > 1) {
			return fibonacci(numero - 1) + fibonacci(numero - 2);
		} else {
			System.out.println("Debes ingresar un tamaño superior o igual a 1");
			return -1;
		}
	}
}
