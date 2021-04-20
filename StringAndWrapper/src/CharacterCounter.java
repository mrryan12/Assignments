
public class CharacterCounter {
	
	public static void main(String[] args)
	{
		String s="rehan";
		char ch = 'r';
	   	System.out.println("the number of occurrence of the character "+ ch + " is " + countCharacter(s,ch));
	}
	public static int countCharacter(String s,char ch)
	{
		int count =0;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)==ch)
	    	{
	    		count++;
	    	}
	    }
		return count;
	}

}
