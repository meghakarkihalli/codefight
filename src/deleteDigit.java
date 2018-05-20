import java.util.ArrayList;

public class deleteDigit 
{
	public static void main(String v[])
	{
		int n = 222250;
		int res = deleteDigit(n);
		System.out.println(res);
	}
	static int deleteDigit(int n) 
	{
		int result = 0;
		ArrayList<Integer> a = new ArrayList<>();
		while(n!=0)
	    {
	        a.add(n%10);
	        n=n/10;
	    }
		int j=1;
		int test[] = new int[6];
		for(int x=0; x<a.size(); x++)
		{
			for(int i=0; i<a.size(); i++)
			{
				//System.out.println("x "+x+" i "+i);
				if(x!=i)
				{
					test[x] = test[x] + (a.get(i)*j);
					j = j * 10;
				}
			}
			//System.out.println(test[x]);
			j=1;
		}
		int max = test[0];
		for(int i=0; i<test.length;i++)
		{
			if(max<test[i])
			{
				max = test[i];
			}
		}
		return max;
	}
}
