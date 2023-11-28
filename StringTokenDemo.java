package javaLab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenDemo {
	public static void main(String[] args) {
		int sum=0,num;
		System.out.println("Enter the input string");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		StringTokenizer input= new StringTokenizer(data);
		while(input.hasMoreTokens()) {
			num=Integer.parseInt(input.nextToken());
			System.out.println("next token="+num);
					sum=sum+num;
		}
		System.out.println("Sum ="+sum);
		
	}

}
