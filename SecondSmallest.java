package javaLab;
import java.util.Scanner;
public class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit of numbers:");
		int limit=sc.nextInt();
		int []a=new int [limit];
		int temp;
		System.out.println("enter the elements:");
		for(int i=0;i<limit;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Smallest Number in the given array is:"+a[1]);
	}



}
