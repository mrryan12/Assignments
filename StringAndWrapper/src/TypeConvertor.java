
public class TypeConvertor {
	
	public static void main(String[] args)
	{
		TypeConvertor tc = new TypeConvertor();
		System.out.println(tc.binaryToLong("00010000"));
		System.out.println(tc.stringToInteger("1456"));
				
	}

	public Long binaryToLong(String binaryNumber)
	{
		Long n =Long.parseLong(binaryNumber,2); 
		return n;
	}
	public int stringToInteger(String integerValue)
	{
		int n =Integer.parseInt(integerValue);
		return n;
	}
}
