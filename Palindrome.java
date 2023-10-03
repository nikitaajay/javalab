/**************************************************************************************
 * File:Palindrome.java
 * Description:To find whether a word is palindrome or not
 * Author:Nikita Ajay
 * Version:1.0
 * Date:03/10/23
 * ************************************************************************************/
package javaLab;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word to be checked:");
		String input=sc.next();
	boolean word =isPalindrome(input);
	if(word)
	{
		System.out.println("The given word is palindrome");
	}
	else
	{
		System.out.println("The given word is not palindrome");
	}
	}
	/**************************************************************************************
	 * To check whether a given word is palindrome or not we use a function called isPalindrome
	 */
	static boolean isPalindrome(String input) {
		char a[]=input.toCharArray();
		int len=input.length();
		for(int i=0;i<=len/2;i++)
			if(a[i]!=a[len-1-i])
			{
				return false;
			}
	
	return true;
}

			
		
		
		
}
