/***
 * Task 1: Expand Characters in a String
 * Input: "a1b4c3" 
 * Output: "abbbbccc"
 * Explanation: The character 'a' is followed by 1, so it appears once.
				The character 'b' is followed by 4, so it appears four times: "bbbb".
				The character 'c' is followed by 3, so it appears three times: "ccc".
				The final output is "abbbbccc".
				
 * Constraints: The string will only contain lowercase letters followed by digits.
 				The input string length will be at most 100.
 * Owner Name : Sachin Gupta
 * DOf : 3/9/2024
 *  ***/

package Assignment_1;

import java.util.Scanner;


public class Task2 {
	
	  public static boolean ValidateString(String str) {
		   for (char c : str.toCharArray()) {
		        if (!Character.isLowerCase(c)) {
		            return false; 
		        }
		    }
		    return true;
	    }
	
	public static void CharFrequency(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i); 
            int count = 1;
            int j = i+1;
            
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }
            
            result += currentChar + String.valueOf(count);
            i = j;
        }

        System.out.println(result);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Constant constant = new Constant();
		
		while(true) {
			System.out.print(constant.Task1);
			String s = in.nextLine();
			if(ValidateString(s)) CharFrequency(s);
			else System.out.println("String Is Invalid Format");
		}
	}
}
