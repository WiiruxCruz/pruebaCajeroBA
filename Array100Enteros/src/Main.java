import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String arg[]) {
		int[] arregloAleatorio = new int[100];
		
		//Creacion de arreglo aleatorio
		for(int i=0; i < arregloAleatorio.length; i++) {
			arregloAleatorio[i] = (int) (Math.random()*1000);
		}
		Arrays.sort(arregloAleatorio);
		
		//System.out.println("Esto tiene despues de ordenarArreglo:" + arregloAleatorio.length);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		int contador = 0;
		for(int idx : arregloAleatorio ) {
			contador++;
			String texto = evaluarPrimo(idx);
			
			map.put(idx, texto);
		}
		
		
		
		System.out.println("Resultado:" + map);
		System.out.println("El tamanio del map es:" + map.size());
		System.out.println("Contador:" + contador);
	}

	private static String evaluarPrimo(int numero) {
		// TODO Auto-generated method stub
		String salida = "No es primo";
		int contador = 2;
		boolean primo = true;
		while( (primo) && (contador < numero) ) {
			if( numero % contador == 0)
				primo = false;
			contador++;
		}
		
		if(primo) {
			salida = "Sí es primo";
		}
		
		return salida;
	}
	
	
}
