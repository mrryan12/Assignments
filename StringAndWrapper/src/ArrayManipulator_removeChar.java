import java.util.Arrays;

public class ArrayManipulator_removeChar {
	
	public static void main(String[] args)
	{
		char[] ch1 = {'r','e','h','a','n'};
		char c = 'h';
		ch1 = removeCharacter(ch1,c);
		
		System.out.println(Arrays.toString(ch1));
	}
	public static char[] removeCharacter(char[] ch,char c)
	{
		char[] c1 = new char[ch.length-1];
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i] == c)
			{
				continue;
			}
				c1[count++] = ch[i];
			
		}
		return c1;

	}
}
