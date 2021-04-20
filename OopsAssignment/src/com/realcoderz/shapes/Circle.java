package com.realcoderz.shapes;

public class Circle {
	
	private float radius;
    float pi =3.5f;
	
	public Circle()
	{
		this.radius = 1.5f;
	}
	 Circle(float radius)
	{
		this(radius,3.5f);
		this.radius=radius;
	}
	private Circle(float radius,float pi)
	{
		this.pi=pi;
		this.radius=radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float calculatedCircleArea(float radius)
	{
		float area = (pi*radius*radius);
		return area;
	}
	public float calculatedCircumFerence(float radius)
	{
		float area = (2*pi*radius);
		return area;
	}
	
	public static void main(String[] args)
	{
		Circle c = new Circle();
		System.out.println(c.calculatedCircleArea(3));
		System.out.println(c.calculatedCircumFerence(4));
	}
	

}
