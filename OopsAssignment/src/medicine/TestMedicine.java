package medicine;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		
		Medicine[] medicine = new Medicine[5];

		Random rd =new Random();
      	int ans = rd.nextInt(3)+1;
    	
    	if(ans == 1)
    	{
    		Medicine m1=new Tablet();
    		m1.displayLabel();
    	}else if(ans == 2)
    	{
    		Medicine m1=new Syrup();
    		m1.displayLabel();
    	}else
    	{
    		Medicine m1=new Ointment();
    		m1.displayLabel();
    	}

	     
	}

}
