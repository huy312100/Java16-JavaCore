package Bai12;

import java.util.Scanner;

public class Bai12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		do {
			System.out.print("Enter first number [1-9]: ");
			num= sc.nextInt();
		} while (num<1 || num >9);
		
		for(int i = 1; i <= num; i++)
		{
		        for(int k = 1; k <= i; k++)
		        {
		            System.out.print(k);         
		        }
		        System.out.println();
		}    
	}
}
