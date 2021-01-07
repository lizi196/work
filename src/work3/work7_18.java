package work3;

public class work7_18 {
	public static void main(String[] args)
    {
		int[] million = createRandomArray();
		sort(million);
		
		for(int i=0;i<11;i++)
			System.out.printf("%d ",million[i]);
		
		
		
		
		
    }
	
	
    public static int[] createRandomArray()
    {
        int[] ass = new int[11];
        for(int i=0;i<11;i++)
            ass[i]=(int)(100*Math.random());
        return ass;
    }


	public static void sort(int[] ass)
	{
	    for(int i=ass.length-1;i>=2;i--)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(ass[j]>ass[j+1])
	            {
	                int tmp = ass[j];
	                ass[j] = ass[j+1];
	                ass[j+1]=tmp;
	            }
	        }
	    }
	}
}
