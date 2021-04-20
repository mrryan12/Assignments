package classes_and_objects;

public class noOfObjects {
	
	static int noOfObject = 0;
	
	public void Display()
	{
		noOfObject += 1;
	}
	
	public noOfObjects()
	{
		Display();
	}

	
	public static void main(String[] args)
	{
		noOfObjects n1 = new noOfObjects();
		noOfObjects n2 = new noOfObjects();
		noOfObjects n3 = new noOfObjects();
		
		System.out.println(noOfObjects.noOfObject);
	}

}
