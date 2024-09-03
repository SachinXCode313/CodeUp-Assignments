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


public class Task1 {
	
	  public static boolean ValidateString(String str) {
	        boolean hasLetter = false;
	        boolean hasDigit = false;

	        for (char c : str.toCharArray()) {
	            if (Character.isLowerCase(c)) {
	                hasLetter = true;
	            } else if (Character.isDigit(c)) {
	                hasDigit = true;
	            }

	            if (hasLetter && hasDigit) {
	                return true;
	            }
	        }
	        return false;
	    }
	
	public static void ExpandChar(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i); 
            i++;
            
            
            String numberStr = "";
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                numberStr += s.charAt(i);
                i++;
            }
           
            int Count = Integer.parseInt(numberStr);
            
            int j = 0;
            while(j < Count) {
            	result += currentChar;
            	j++;
            }
            
        }

        System.out.println(result);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Constant constant = new Constant();
		
		while(true) {
			System.out.print(constant.Task1);
			String s = in.nextLine();
			if(ValidateString(s)) ExpandChar(s);
			else System.out.println("String Is Invalid Format");
		}
	}
}
