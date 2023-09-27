/************************************************
 * File:PositiveNumber.java
 * Author:Nikita Ajay
 * Description:To find whether a number is positive or negative
 *Date:27/09/2023
*Version:1.0
*/	 
import java.util.Scanner;
public class PositiveNumber {
public static void main(String[]args) {
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	number=sc.nextInt();
	if(number>0)
		System.out.println("Number is positive");
	else
		System.out.println("Number is negative");
}
}
