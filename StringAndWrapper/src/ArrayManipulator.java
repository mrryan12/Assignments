
public class ArrayManipulator {
	public static void main(String[] args)
	{
	  int[] arr = {1,4,5,8,2,6};	
	  System.out.println(getArraySum(arr));
	}
	public static int getArraySum(int []elements) {
		
		 int sum = 0;
		 for(int i = 0;i<elements.length;i++) {
			 
			 sum +=elements[i];
		 }
		 return sum;
	}
}
