package Bai16;

import java.util.Scanner;

public class Bai16 {
	public static boolean checkYear(int year) 
	{ 
	    if (year % 400 == 0) 
	        return true; 
	    if (year % 4 == 0 && year % 100 != 0) 
	        return true;
	    return false; 
	} 
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a year: ");
		Scanner sc= new Scanner(System.in);
		int year=sc.nextInt();
		
		if(checkYear(year))
			System.out.println("Leap year");
		else {
			System.out.println("Not a leap year");
		}
	}
}
