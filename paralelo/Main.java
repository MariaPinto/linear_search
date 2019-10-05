package mpinto_linearsearch.paralelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[6];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * 10);
		}
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		int key  = (int)(Math.random() * 10);
		Hilo hilo1 = new Hilo(array,0, (array.length / 2) - 1, key );
		Hilo hilo2 = new Hilo(array, (array.length / 2), array.length - 1, key );
		
		System.out.println(key);
		hilo1.start();
		hilo2.start();
	}

	
}
