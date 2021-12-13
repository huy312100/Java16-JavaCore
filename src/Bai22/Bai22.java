package Bai22;

import java.util.Scanner;

public class Bai22 {
	 public static String longestPalindrome(String s) {
        int max_len = 0;
        int min_start = 0;
        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        for(int i = 0; i < s.length(); i++) {
            if (s.length() - i <= max_len / 2) 
                break;

            int j = i, k = i;
            while (k < s.length()-1 && s.charAt(k+1) == s.charAt(k)) ++k;
            int len = expandAroundCenter(s, j, k);

            if(len > max_len) {
                max_len = len;
                min_start = j - (len - (k - j + 1)) / 2;
            }
        }
        return s.substring(min_start,max_len);
    }
    
    public static int expandAroundCenter(String s,int left,int right){
        while(left>=0 && right< s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        return right-left-1;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String input= sc.nextLine();
		
		System.out.println("Longest palindromic substring : "+longestPalindrome(input));
	}
}
