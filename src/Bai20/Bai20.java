package Bai20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai20 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
			
		do {
			System.out.print("Enter number of array: ");
			n = sc.nextInt();
		} while (n < 0);
			
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] : ");
			array[i] = sc.nextInt();
		}
		
		List<Integer> odd =new ArrayList<Integer>();
		List<Integer> even =new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				even.add(array[i]);
			}
			else {
				odd.add(array[i]);
			}
		}
		System.out.println("Even number:"+even);
		System.out.println("Odd number:"+odd);
	}
}
