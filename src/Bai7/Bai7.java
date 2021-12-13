package Bai7;

import java.util.Scanner;

public class Bai7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("Result :");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(" "+i);
			}
		}
	}
}
