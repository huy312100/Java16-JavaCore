package Bai19;

import java.util.Scanner;

public class Bai19 {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1) ax + b = 0  ");
		System.out.println("2) ax^2 + bx + c = 0 ");
		System.out.print("Select : " );
		
		int selected = sc.nextInt();
		
		switch (selected) {
		case 1:
			System.out.println(System.lineSeparator().repeat(100));
			System.out.println("ax + b = 0 ( a <> 0) ");
			System.out.print("Enter a: ");
			double a = sc.nextInt();
			System.out.print("Enter b: ");
			double b = sc.nextInt();
			double x = (-b)/a;
			System.out.print("x = " + x);
			break;
		case 2:
			System.out.println(System.lineSeparator().repeat(100));
			System.out.println("ax^2 + bx + c = 0 ( a <> 0)");
			System.out.print("Enter a: ");
			double a1 = sc.nextDouble();
			System.out.print("Enter b: ");
			double b1 = sc.nextDouble();
			System.out.print("Enter c: ");
			double c1 = sc.nextDouble();
			
			double delta = (b1*b1) - (4*a1*c1);
			
			if(delta < 0.0) {
				System.out.println("The equation has no solution");
			}
			else if(delta == 0.0) {
				double xRes = -b1/(2*a1);
				System.out.println("x1 = x2 = " + xRes);
			}
			else {
				double x1 = (-b1 + Math.sqrt(delta)) / (2*a1);
				double x2 = (-b1 - Math.sqrt(delta)) / (2*a1);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			break;
		default:
			System.out.println("You must enter 1 or 2. Try again");
			break;
		}
	}
}
