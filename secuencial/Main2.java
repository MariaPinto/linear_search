package mpinto_linearsearch.secuencial;

public class Main2 {
	public static long search(int arr[], int x) 
	{ 
		long time;
	    int n = arr.length; 
	    
	    long start = System.currentTimeMillis();
	    for(int i = 0; i < n; i++) 
	    { 
	        if(arr[i] == x) 
	        {
	        	time = System.currentTimeMillis() - start;
	        }
	    } 
	    time = System.currentTimeMillis() - start;
	    return time; 
	} 
	  
	public static void main(String args[]) 
	{ 
		int array[];
		int size;
		
	    for(int t = 10; t < 1000000000; t *= 10)
	    {
	    	size = t;
	    	array = new int[size];
	    	for(int i = 0; i < array.length; i++)
			{
				array[i] = (int)(Math.random() * size);
			}
		
			int key  = (int)(Math.random() * size);
		      
		    long result = search(array, key); 
		    System.out.println("tam: " + size + " tiempo: " + result);
	    }
	} 

}
