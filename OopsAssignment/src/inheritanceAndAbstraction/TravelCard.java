package inheritanceAndAbstraction;

public class TravelCard extends PrepaidCard implements Rewardable {
	
	private double rewardPoints;


	public boolean swipeCard(double amount) {
	 	amount = amount*60;
        if(amount < getSwipeLimit() && amount < getAvailableBalance())
        {
        	double charge = amount*5/100;
        	setAvailableBalance(getAvailableBalance() - amount - charge);
        	
        	int points = (int)(amount / 100);
        	rewardPoints += points;
        	
        }else
        {
        	System.out.println("you've entered wrong amount");
        }
		return true;
	}

	public double calculatingRewardPoint(double amount) {
		return rewardPoints;
	}

}
