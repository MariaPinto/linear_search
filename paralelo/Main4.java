package mpinto_linearsearch.paralelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int size;
		int array[];
		long acumulador = 0;
		FileOutputStream os = new FileOutputStream("C:\\Users\\Maria Luisa\\Documents\\ULASALLE\\tiempos2.txt");
		
		PrintStream ps = new PrintStream(os);
		for(int t = 10; t < 1000000000; t*=10)
		{
			size = t;
			array = new int[size];
			for(int i = 0; i < array.length; i++)
			{
				array[i] = (int)(Math.random() * size);
			}
			
		
			int key  = (int)(Math.random() * size);
			
			ArrayList<Hilo2> hilos = new ArrayList<Hilo2>();
			
			for(int i = 0; i < size/(size/10); i++)
			{
				hilos.add(new Hilo2(array, i * (size/10), ((i + 1) * (size/10)), key));			
			}
			
			for(int i = 0; i < size/(size/10); i++)
			{
				hilos.get(i).start();			
			}
			
			while(!hilos.isEmpty())
			{
				for(int i = 0; i < hilos.size(); i ++)
				{
					if(!hilos.get(i).isAlive())
					{
						acumulador += hilos.get(i).getTime();
						hilos.remove(i);
					}
				}
			}
			
			System.out.println("tam" + size + " tiempo:" + acumulador);
			 ps.println( size + "\t" + acumulador);
		}
	}
}
