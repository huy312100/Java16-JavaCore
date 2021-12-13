package Bai14;

import java.util.HashMap;
import java.util.Scanner;

public class Bai14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<String,Integer> UniqueArray = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of array: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i ++) {
			System.out.print("array[" + i + "]: ");
			String tempString = sc.next();
			UniqueArray.put(tempString, i);
		}
		System.out.print("Array after delete duplicate:");
		for(String i : UniqueArray.keySet()) {
			System.out.print(" "+i);
		}
	}
}
