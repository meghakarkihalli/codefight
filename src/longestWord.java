
public class longestWord {

	public static void main(String[] args) 
	{
		String s = "A!! AA[]z";
		String res = longestWord(s);
		//System.out.println(res);
	}
	static String longestWord(String s)
	{
		String result; 
        String a[] = s.split(" ");
        String b[] = new String[a.length];
		
	result = a[0];
	for(int i=0; i<=a.length-1; i++)
	{
		System.out.println(a[i]);
		//b[i] = a[i].replaceAll("[^\\w\\s]+","");
		char[] t = a[i].toCharArray();
		for(int j=0; j<a[i].length(); j++)
		{
			System.out.println(t[j]);
			if()
		}
    }
	int len = 0;
	for(int i=0; i<b.length; i++)
	{
		//if(b[i].length()>len)
		//{
			//result = b[i];
			//len = b[i].length();
		//}
	}
	return result;
	}   

}
