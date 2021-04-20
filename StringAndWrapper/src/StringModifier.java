
public class StringModifier {
	
	public static void main(String[] args)
	{
		
	 String str = "hello";
	 int position = 3;
	 char c = 'r';
	 
	 System.out.println(insertCharacter(str,c,position));
	}
	public static String insertCharacter(String string,char c,int position){
		
		
		return string.substring(0,position )+ c + string.substring(position); 
	 }

}
