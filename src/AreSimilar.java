import java.util.ArrayList;
import java.util.Arrays;

public class AreSimilar 
{
	public static void main(String v[])
	{	
		int[] a = {1,2,2};
		int[] b = {1,1,2};
		System.out.println(areSimilar(a,b));
	}
	static boolean areSimilar(int[] a, int[] b) 
	{
		ArrayList<Integer> index = new ArrayList<>();
		for (int i = 0; i < a.length; i++) 
		{
			if ( a[i] != b[i] ) 
				index.add(i);
		}
		if (index.size() == 0) 
			return true;
		if (index.size() != 2)
			return false;
		if (a[ index.get(0)] == b[index.get(1)] && a[index.get(1)] == b[ index.get(0)]) 
			return true;
		return false;
		
		
		
		/*ArrayList<Integer> index = new ArrayList<Integer>();
	    if(a.length != b.length)
	    {
	        System.out.println("Entered"+a.length+" "+b.length);
	        return false;
	    }
	    int[] a1 = Arrays.copyOf(a, a.length);
	    int[] b1 = Arrays.copyOf(b, b.length);
	    Arrays.sort(a1);
	    Arrays.sort(b1);
	    for(int i=0; i<a1.length; i++)
	    {
	    	System.out.print(b[i]+" ");
	    	if(a1[i]==b1[i])
	    	{
		        if(a[i] != b[i] )
		        {
		            index.add(i);
		        }
	    	}
	    	else
	    		return false;
	    }
	    if(index.size()>=2)
	    {
	    	
	    }
		return false;
	}
	static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}*/
	}
}
