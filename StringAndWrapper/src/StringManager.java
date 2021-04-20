
public class StringManager {
	
	public static void main(String[] args)
	{
		String string1 ="hello world";
		String string2 = "java";
		char ch = 'w';
		System.out.println(insertString(string1,string2,ch));
	}
	
	public static String insertString(String string1, String string2, char ch)
	{
		String temp = null;
		for(int i=0;i<string1.length() ; i++)
		{
			if(string1.charAt(i) == ch)
			{
				int n = string1.indexOf(ch);
				String s = string1.substring(0,n);
				temp = s + string2 + string1.substring(n);
			}
		}
		return temp;
	}

}
