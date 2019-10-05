package mpinto_linearsearch.paralelo;

public class Hilo extends Thread{

	int array[];
	int startindex;
	int endindex;
	int key;
	boolean flag;
	long time;
	
	public Hilo(int[] array, int startindex, int endindex, int key) {
		super();
		this.array = array;
		this.startindex = startindex;
		this.endindex = endindex;
		this.key = key;
	}

	public void run() 
	{
		long startTime = System.currentTimeMillis();
		for(int i = startindex; i<endindex; i++) 
		{
			if(key == array[i]) 
			{
				System.out.println("Search is successful. "  + "index: " + i);
				flag = true;
				return;
			}
		}
		
		time = System.currentTimeMillis() - startTime;
	}
	
	public long getTime()
	{
		return time;
	}
}