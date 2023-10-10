/**************************************************************************************
 * File:AreaOfShapes.java
 * Description:To find the area of different shapes
 * Author:Nikita Ajay
 * Version:1.0
 * Date:10/10/23
 * ************************************************************************************/
 
package javaLab;

public class AreaOfShapes {
	public static void main(String[] args) {
		Shape shape=new Shape();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base of the triangle :");
		float base=sc.nextFloat();
		System.out.println("Enter the height of the triangle :");
		
		float height=sc.nextFloat();
		System.out.println("Enter the length of the rectangle :");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle :");
		
		int breadth=sc.nextInt();
		System.out.println("Enter the radius of the circle :");
		float radius=sc.nextFloat();
		Shape.area(height,base);
		Shape.area(length,breadth);
		Shape.area(radius);
		
	}
}
class Shape{
	public static void area(int length,int breadth) {
		System.out.println("Area of Rectangle="+(length*breadth));
	}
	public static void area(float height,float base) {
		System.out.println("Area of Triangle="+(0.5*height*base));
	}
	public static void area(float radius) {
		System.out.println("Area of Circle="+(3.14*radius*radius));
	}
	

}
