package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		List<Integer> res=new ArrayList<Integer>();
		while(num>0) {
			res.add(num%2);
			num/=2;
		}
		for (int i = res.size()-1; i >=0; i--) {
			System.out.print(res.get(i));
		}
	}
}
