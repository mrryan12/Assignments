import java.util.Arrays;

public class ArrayManipulator_productCol {
	
	public static void main(String[] args)
	{
		int[] arr = {2,5,7,8};
		int []arr1 =changeArray(arr);
	    System.out.println(Arrays.toString(arr1));
	}
	public static int[] changeArray(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i] *= arr[i+1];
		}
		return arr;
	}

}
