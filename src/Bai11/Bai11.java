package Bai11;

import java.util.Scanner;

public class Bai11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		double result = (double)(Math.log(num) / Math.log(2));
		int resultTmp = (int)(Math.log(num) / Math.log(2));
		if(result == resultTmp) {
			System.out.println(resultTmp-1);
		}
		else {
			System.out.println(resultTmp);
		}
	}
}
