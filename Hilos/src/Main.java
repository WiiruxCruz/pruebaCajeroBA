
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Imprimir I = new Imprimir();
		Hilo T1 = new Hilo("Proceso - 1", I);
		Hilo T2 = new Hilo("Proceso - 2", I);
		T1.start();
		T1.sleep(100);
		T2.start();
	
		try {
			T1.join();
			T2.join();
		} catch(Exception e) {
			System.out.println("Interrumpido");
        }
	}
}
