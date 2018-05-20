import java.util.ArrayList;
import java.util.Collections;

public class firstDuplicate {

	public static void main(String[] args) 
	{
		int[] a = {2,3,5,1,6};
		int result = locateDuplicate(a);
		System.out.println(result);

	}
	static int locateDuplicate(int[] a)
	{
		int len = a.length;
	    int small =0;
	    ArrayList<Integer> index = new ArrayList<Integer>();
	    for(int i=0; i<len-1; i++)
	    {
	    	if(a[i]<(a.length-1))
	    	{
	    		if(a[Math.abs(a[i])]>=0) 
	           		a[i] = -a[i];
	        	else
	        		a[Math.abs(a[i])] = -a[Math.abs(a[i])];
	        }
	    	else if(a[i]>=(a.length-1))
	    	{
	    		a[i] = -a[i];
	    	}
	        else
	        {
	        	System.out.println(a[i]);
	        }
	    }
	    if(index.isEmpty())
        {
            return -1;
        }
	    return index.get(0);
	}

}
