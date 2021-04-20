package inheritanceAndAbstraction;

public abstract class PrepaidCard {
	
	private int CardNo;
	private double availableBalance;
	private double swipeLimit;
	
	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public abstract boolean swipeCard(double amount);

	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + getSwipeLimit()
				+ "]";
	}
	
	public void rechargeCard(double amount)
	{
		availableBalance +=amount;
	}

	public double getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}

}
