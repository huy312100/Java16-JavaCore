package Bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai9 {
	public static boolean Handle(int num1,int num2) {
		List<Integer> arrNum= new ArrayList<>();
		while(num1>0 && num2>0) {
			arrNum.add(num1%10);
			arrNum.add(num2%10);
			num1/=10;
			num2/=10;
		}
		Collections.sort(arrNum);
		for(int i=0;i<arrNum.size()-1;i++) {
			if(arrNum.get(i) == arrNum.get(i+1)) {
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2;
		do {
			System.out.print("Enter first number [10-99]: ");
			num1= sc.nextInt();
			System.out.print("Enter second number [10-99]: ");
			num2= sc.nextInt();
		} while (num1<10 || num1 >99 || num2<10 || num2 > 99);
		
		boolean res=Handle(num1, num2);
		if(res) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}

	}
}
