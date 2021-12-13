package Bai10;

import java.util.Scanner;

public class Bai10 {
	 public static boolean isPrimeNumber(int n) {
	        if (n < 2) {
	            return false;
	        }
	        int squareRoot = (int) Math.sqrt(n);
	        for (int i = 2; i <= squareRoot; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		for (int i = 1; i <= num; i++) {
			if(isPrimeNumber(i)) {
				sum+=i;
			}
		}
		
		System.out.println("Sum of prime number : "+sum);
		
	}
}
