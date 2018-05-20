import java.util.Stack;
//incomplete
public class buildPalindrome 
{
	public static void main(String v[])
	{
		String st = "abcdc ";
		String result = buildPalindrome(st);
		System.out.println(result);
	}
	static String buildPalindrome(String st) 
	{
	    int len = st.length();
	    Stack<Character> a = new Stack<Character>();
	    if(checkPal(st,len,0))
	    	return st;
	    for(int i=0;i<len-1;i++)
	    {
	    	a.push(st.charAt(i));
	    }
	    int j = a.size();
	    while(j!=0)
	    {
	    	String s = (a.pop().toString());
	    	//System.out.println("last char "+st.charAt(st.length()-1));
	    	//System.out.println("s "+s);
	    	//System.out.println(s.equals(String.valueOf(st.charAt(st.length()-1))));
	    	if(len%2==0)
	    	{
	    	if(!(s.equals(String.valueOf(st.charAt(st.length()-1)))))
	    	{
	    		//System.out.println("entered ");
	    		st = st + s;
	    		if(checkPal(st, st.length(),0))
	    			break;
	    	}
	    	}
	    	else
	    	{
	    		if(!(s.equals(String.valueOf(st.charAt(st.length()-2)))))
		    	{
		    		//System.out.println("entered ");
		    		st = st + s;
		    		if(checkPal(st, st.length(),0))
		    			break;
		    	}
	    	}
	    	j--;
	    }
	    return st;
	}

	static boolean checkPal(String st, int len, int first)
	{
	    if(len==1)
	        return true;
	    
	    if(st.charAt(first) != st.charAt(len-1))
	        return false;
	    
	    if(first<len)
	        return checkPal(st,len-1, first+1);
	    
	    return true;
	}

}
