package com.test;
import com.shape.*;

public class TestMain {
	
	public static void main(String[] args)
	{
	Square square = new Square();
	Rectangle rectangle = new Rectangle();
	square.setSide(4);
	rectangle.setLength(4);
	rectangle.setWidth(5);
	square.calcArea();
	square.calcPeri();
	rectangle.calcArea();
	rectangle.calcPeri();
	}

}
