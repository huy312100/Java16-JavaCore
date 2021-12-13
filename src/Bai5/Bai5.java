package Bai5;

import java.util.Scanner;

public class Bai5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter xA: ");
		Scanner sc= new Scanner(System.in);
		int xA=sc.nextInt();
		System.out.print("Enter yA: ");
		int yA=sc.nextInt();
		System.out.print("Enter xB: ");
		int xB=sc.nextInt();
		System.out.print("Enter yB: ");
		int yB=sc.nextInt();
		
		double res= Math.sqrt(Math.pow(xA-xB,2)+Math.pow(yA-yB,2));
		System.out.printf("AB = "+ res);
	}
}
