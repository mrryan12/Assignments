
public class ArrayManipulator1 {
	
	public static void main(String[] args)
	{
	  int[] arr = {1,4,5,8,2,6};
	  int[] array = changeNumber(arr);
	  
	  for(int i=0;i<array.length;i++)
	  {
		  System.out.print(array[i] + " "); 
	  }
	  
	}
	
	public static int[] changeNumber(int []elements)
	{
		 int[] arr = new int[6] ;
		 int count = 0;
		
		 for(int i = 0;i<elements.length;i++) {
			 
			  if(elements[i]%2==0)
			  {
				  arr[count++] = elements[i]-1;  
			  }
			  if(elements[i]%2 != 0)
			  {
				  arr[count++] = elements[i]+1;  
			  }
			  
		   
		 }
		 return arr;
}
}
