package javaLab;
import java.util.Scanner;
public class ReverseString {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.next();
		int length=word.length();
		char a[]=word.toCharArray();
		System.out.println("Reversed string is:");
		for(int i=length-1;i>=0;i--) {
			System.out.print(""+a[i]);
		
	}
	}
}
