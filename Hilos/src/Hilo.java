
public class Hilo extends Thread{
	private Thread t;
	private String nombreHilo;
	Imprimir i;
	
	Hilo( String nombre, Imprimir i){
		this.nombreHilo = nombre;
		this.i = i;
	}
	
	public void run() {
		
		synchronized(i) {
			i.conteo(nombreHilo);
			try {
				Thread.sleep( (int) Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Error de sincronización");
			}
		}
		
		System.out.println("Proceso " + nombreHilo + " saliendo");
	}
	
	public void start() {
		System.out.println("Iniciando " + nombreHilo);
		if(t == null) {
			t = new Thread(this, nombreHilo);
			t.start();
		}
	}
}
