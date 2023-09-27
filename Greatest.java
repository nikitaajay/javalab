
/**************************
File:Greatest.java
 * Author:Nikita Ajay
 * Description:To find greatest among 3 numbers10
 *Version:1.0
 *Date:27/09/2023
 */
package lab;
import java.util.Scanner;
public class Greatest {
public static void main(String[]args) {
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	firstNumber=sc.nextInt();
	System.out.println("Enter the second number");
	secondNumber=sc.nextInt();
	System.out.println("Enter the third number");
	thirdNumber=sc.nextInt();
	if(firstNumber>secondNumber && firstNumber>thirdNumber)
		System.out.println("Greatest number:"+firstNumber);
	else if(secondNumber>thirdNumber)
		System.out.println("Greatest number:"+secondNumber);
	else
		System.out.println("Greatest number:"+thirdNumber);
	
		
	
	
}
}
