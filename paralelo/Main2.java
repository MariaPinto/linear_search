package mpinto_linearsearch.paralelo;

import java.util.ArrayList;

public class Main2 {

	int array[];
	int size;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 100000000;
		int array[] = new int[size];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * size);
		}
		
	
		int key  = (int)(Math.random() * size);
		
		ArrayList<Hilo> hilos = new ArrayList<Hilo>();
		
		for(int i = 0; i < size/(size/10); i++)
		{
			hilos.add(new Hilo(array, i * (size/10), ((i + 1) * (size/10)), key));			
		}
		System.out.println(key);
		for(int i = 0; i < size/(size/10); i++)
		{
			hilos.get(i).start();			
		}
	}

	void imprimeArray()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
