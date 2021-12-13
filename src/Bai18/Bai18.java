package Bai18;

import java.util.Scanner;

public class Bai18 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your money: ");
		double amount = sc.nextDouble();
		double goal;
		do {
			System.out.print("Enter money you expected: ");
			goal = sc.nextDouble();
		}while(goal<=amount);
		
		System.out.print("Interest money: ");
		double interest = sc.nextDouble();
		
		double rate = interest/amount;
		int year = 0;
		
		while(amount < goal) {
			amount += amount*rate;
			year++;
		}
		
		System.out.println("Need to save for " + year +" year(s)");
	}
}
