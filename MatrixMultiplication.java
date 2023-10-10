/**************************************************************************************
 * File:MatrixMultiplication.java
 * Description:To find the product of two matrices
 * Author:Nikita Ajay
 * Version:1.0
 * Date:10/10/23
 * ************************************************************************************/
 
package javaLab;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row_size1,col_size1,row_size2,col_size2;
		System.out.println("Enter the row and column size of matrix 1:");
		row_size1=sc.nextInt();
		col_size1=sc.nextInt();
		System.out.println("Enter the row and column size of matrix 2:");
		 row_size2=sc.nextInt();
		 col_size2=sc.nextInt();
		 int [][]matrix1=new int [row_size1][col_size1];
		 int [][]matrix2=new int [row_size2][col_size2];
		 int [][]resultant=new int [row_size1][col_size2];
		 int i,j,k;
		 if(col_size1==row_size2)
		 {
			 System.out.println("Multiplication is possible");
			 System.out.println("Enter the first matrix:");
		for(i=0;i<row_size1;i++)
		{
			for(j=0;j<col_size1;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		 
		 System.out.println("Enter the second matrix:");
			for(i=0;i<row_size2;i++)
			{
				for(j=0;j<col_size2;j++)
				{
					matrix2[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<row_size1;i++)
			{
				for(j=0;j<col_size2;j++)
				{
					resultant[i][j]=0;
				for(k=0;k<row_size2;k++)
				{
					resultant[i][j]=resultant[i][j]+matrix1[i][k]*matrix2[k][j];
				}
				}
			}
			System.out.println("matrix1:");
			for(i=0;i<row_size1;i++)
			{
				for(j=0;j<col_size1;j++)
				{
					System.out.print(matrix1[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println(" matrix2:");
			for(i=0;i<row_size2;i++)
			{
				for(j=0;j<col_size2;j++)
				{
					System.out.print(matrix2[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("Resultant matrix:");
			for(i=0;i<row_size1;i++)
			{
				for(j=0;j<col_size2;j++)
				{
					System.out.print(resultant[i][j]+"\t");
				}
				System.out.println();
			}
		 }
		 else
		 {
			 System.out.println("Multiplication is not possible");
		 }
	}
	
			
			
			 
}
