
public class EvenSum {
	
	public static void main(String[] args)
	{
	  int[] arr = {1,4,5,8,2,6};	
	  System.out.println(getSmallest(arr));
	}
 
	 public static int getSmallest(int [ ]elements)
	 {
		 int min =elements[0];
		 for(int i = 0;i<elements.length;i++) {
			 
			 if(elements[i] < min)
			 {
				 min = elements[i];
			 }
		 }
		 return min;
	 }
}
