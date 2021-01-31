package Threads;

public class ThreadsV1 extends Thread
{

	private String nombre;
	private int inicial;
	private int ml;
	
	public ThreadsV1(String nombre, int inicial, int ml)
	{
		System.out.println("Extendiendo la clase Thread.");
		this.nombre = nombre;
		this.inicial = inicial;
		this.ml = ml;
		System.out.println(this.nombre);
	}

	public void run()
	{
		try 
		{
			for(int i = inicial; i <= 20; i+=2)
			{
				System.out.println(i);
				Thread.sleep(ml);
			}
		}
		catch(Exception e)
		{

		}
	}
	public static void main(String[] args) 
	{
		ThreadsV1 t0 = new ThreadsV1("Números pares entre 1 y 20", 2, 100);
		ThreadsV1 t1 = new ThreadsV1("Números impares entre 1 y 20", 1, 100);

		t0.start();
		t1.start();
	}

}
