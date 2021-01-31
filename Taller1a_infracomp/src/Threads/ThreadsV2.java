package Threads;

public class ThreadsV2 implements Runnable
{

	private String nombre;
	private int inicial;
	private int ml;
	
	public ThreadsV2(String nombre, int inicial, int ml)
	{
		System.out.println("Implementando la interfaz Runnable. ");
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
		Thread t0 = new Thread(new ThreadsV2("Números pares entre 1 y 20", 2, 100));
		Thread t1 = new Thread(new ThreadsV2("Números impares entre 1 y 20", 1, 100));

		t0.start();
		t1.start();
	}

}
