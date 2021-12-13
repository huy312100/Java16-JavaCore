package Bai15;

import java.util.Scanner;

public class Bai15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String input= sc.nextLine();

		System.out.println("String : "+input);
		System.out.println("1)Length of string ");
		System.out.println("2)Print out the character (char) at a certain position (index)");
		System.out.println("3)Check if, in the input string, there is a substring \"abcdef\" or not");
		
		System.out.print("Select : " );
		int selected = sc.nextInt();	
		switch (selected) {
		case 1:
			System.out.println(System.lineSeparator().repeat(100));
			System.out.println("Length of string : "+input.length());
			break;
		case 2:
			System.out.println(System.lineSeparator().repeat(100));
			int id;
			do {
				System.out.print("Enter index you want to get : ");
				id=sc.nextInt();
			} while (id>input.length()-1 || id<0);
			char charAtId = input.charAt(id);
			System.out.println("Value at index : " + charAtId);
			break;
		case 3:
			System.out.println(System.lineSeparator().repeat(100));
			if(input.contains("abcdef")) {
				System.out.println("Chua chuoi abcdef");
			}
			else {
				System.out.println("Khong chua chuoi abcdef");
			}
			break;
		default:
			System.out.println("Enter number from 1-3. Try again");
			break;
		}
	}
}
