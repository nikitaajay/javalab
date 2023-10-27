/**************************************************************************************
 * File:Abstractclass.java
 * Description:To print the number of sides of shapes
 * Author:Nikita Ajay
 * Version:1.0
 * Date:27/10/23
 * ************************************************************************************/
package javaLab;

public class Abstractclass {
	public static void main(String[] args) {
		Rectangle rectangle =new Rectangle();
		rectangle.numberofsides();
		Triangle triangle =new Triangle();
		triangle.numberofsides();
		Hexagon hexagon =new Hexagon();
		hexagon.numberofsides();
	}
}
abstract class SHAPE{
	public void numberofsides() {
	}
}
class Rectangle extends SHAPE{
	public void numberofsides() {
		System.out.println("The number of sides of rectangle is " +4 );
	}
}
class Triangle extends SHAPE{
	public void numberofsides() {
		System.out.println("The number of sides of triangle is " +3 );
	}
}
class Hexagon extends SHAPE{
	public void numberofsides() {
		System.out.println("The number of sides of hexagon is  " +6 );
	}
}

	
	

		
	
	


