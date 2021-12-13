package Bai21;

import java.util.Scanner;

public class Bai21 {
	public static boolean checkMeet(int x1,int x2,int v1,int v2) {
		while(x1<x2) {
			x1+=v1;
			x2+=v2;
			if(x1==x2) {
				return true;
			}
		}
		return false;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1,v1,x2,v2;
		do {
			System.out.print("Enter x1 :");
			x1 = sc.nextInt();
			
			System.out.print("Enter v1: ");
			v1 = sc.nextInt();
			
			System.out.print("Enter x2: ");
			x2 = sc.nextInt();
			
			System.out.print("Enter v2: ");
			v2 = sc.nextInt();
		} while (x1>x2 ||x1>=10000 || x2 >=10000 ||v1>10000||v2>10000||x1<0||x2<0||v1<1||v2<1 );
		
		if(v1<=v2) {
			System.out.println("Cant not meet each other");
		}
		else {
			if(checkMeet(x1, x2, v1, v2)) {
				System.out.println("Will meet each other");
			}
			else {
				System.out.println("Cant not meet each other");
			}
		}
	}
}
