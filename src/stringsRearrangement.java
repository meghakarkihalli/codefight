import java.util.Arrays;

public class stringsRearrangement 
{
	public static void main(String v[])
	{
		String[] s = {"abc", 
				 "abx", 
				 "axx", 
				 "abc"};
		
		System.out.println(stringsRearrangement(s));
	}
	static boolean stringsRearrangement(String[] inputArray) 
	{
		int[] a = new int[inputArray.length];
		Arrays.sort(inputArray); //{"aa","ad","bb"}
		int wordcount=0;
		for(int i=0; i<inputArray.length-1; i++)
		{
			char[] c1 = inputArray[i].toCharArray();
			char[] c2 = inputArray[i+1].toCharArray();
			int count = 0;
			a[i] = 0;
			int j=0;
			while(j<c1.length)
			{
				if(c1[j] != c2[j])
				{
					System.out.println(c1[j]+" "+c2[j]);
					count++;
					wordcount++;
				}
				j++;
				if(count!=1)
					return false;
			}
		}
		
		return true;
	}
}
