package Bai4;

import java.util.Scanner;

public class Bai4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int res=0;
		while(num>0) {
			res+=num%10;
			num/=10;
		}
		System.out.println("Sum of the digits: "+res);
	}
}
