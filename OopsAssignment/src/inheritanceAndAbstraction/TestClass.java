package inheritanceAndAbstraction;

public class TestClass {

	public static void main(String[] args) {

		TravelCard travelCard = new TravelCard();
		travelCard.setCardNo(123);
		travelCard.setAvailableBalance(50000);
		travelCard.setSwipeLimit(10000);
		
		travelCard.swipeCard(1000);
		System.out.println(travelCard.getAvailableBalance());
		System.out.println(travelCard.getCardNo());
		System.out.println(travelCard.getSwipeLimit());
		System.out.println(travelCard.calculatingRewardPoint(5000));
	}

}
