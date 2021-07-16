
public class Imprimir {
	public void conteo(String nombreThread) {
		try {
			for(int i = 10000; i > 0; i--)
				System.out.println("Contador de " + nombreThread + " ---- " + i);
		} catch (Exception e) {
			System.out.println("Proceso interrumpido.");
		}
	}
}
