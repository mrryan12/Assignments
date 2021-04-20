package com;

public class CarDemo {
	
	 public static void main(String[] args) {
		 Car c1=new Car("Hyundai","santro",5,600000); 
		 Car c2=new Car("Hyundai","i10",5,650000);
		 Car c3=new Car("Suzuki","swift",6,700000);
		 Car c4=new Car("Suzuki","Balleno",6,750000);
		 
		 System.out.println("best car for highest value of onRoadPrice is " + bestCar(c1,c2,c3,c4,750000));
		
	 }
	 public static String bestCar(Car c1,Car c2,Car c3,Car c4,double c) {
		 
		  Car cc=c1;
		 if(c2.getOnRoadPrice() > cc.getOnRoadPrice())
			    cc=c2;
			   if(c3.getOnRoadPrice() > cc.getOnRoadPrice())
			    cc=c3;
			   if(c4.getOnRoadPrice() > cc.getOnRoadPrice())
			    cc=c4;
			   
			  String mm = cc.getMake();
			  String mmm=cc.getModel();
			 
		 
		 
		 return (mm + "-" + mmm);
	 }

}
class Car{
	private String make;
	private String model;
	private int passengerCapacity;
	private double onRoadPrice;
	
	public Car(String make,String model,int passengerCapacity,double onRoadPrice) {
		this.make=make;
		this.model=model;
		this.passengerCapacity=passengerCapacity;
		this.onRoadPrice=onRoadPrice;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity() {
		this.passengerCapacity=passengerCapacity;
	}
	public double getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice() {
		this.onRoadPrice=onRoadPrice;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
}
