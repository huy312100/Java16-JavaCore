package Bai6;

import java.util.Scanner;

public class Bai6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		System.out.print("Reverse string: ");
		for(int i=len-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}
}
