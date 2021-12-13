package Bai17;

import java.util.Random;
import java.util.Scanner;

public class Bai17 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		Random rand = new Random();
		int int_random = rand.nextInt(1001);
		do {
			System.out.print("Enter a number [0-1000]: ");
			num= sc.nextInt();
			if(num>int_random)
				System.out.println("Greater than secret number");
			else if(num<int_random)
				System.out.println("Smaller than secret number");
			else	
				System.out.println("Congratulation ");
		} while (num != int_random || num >1000 || num<0);
	}
}
