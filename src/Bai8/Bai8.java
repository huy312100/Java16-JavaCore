package Bai8;

import java.util.Scanner;

public class Bai8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();

	    char[] charArray = str.toCharArray();
	    boolean foundSpace = true;

	    for(int i = 0; i < charArray.length; i++) {

	      if(Character.isLetter(charArray[i])) {

	        if(foundSpace) {
	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }
	      else {
	        foundSpace = true;
	      }
	    }
	    str = String.valueOf(charArray);
	    System.out.println("Result : " + str);
	}
}
