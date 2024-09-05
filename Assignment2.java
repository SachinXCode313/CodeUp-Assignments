/***
 * In this program the user will first enter a string. After that, the program should ask the user which operation they want to execute on the string.
 * Following operation user can performed :
 * Append : it is use to append two strings             
 * CountWord : it is used to cound the no. of words in string        
 * Replace : it is used to replace a string in string           
 * isPalindrome : it used to check a given string is palindrome or not        
 * Splice : Removes a substring from the current string starting at index start and of length length.   
 * Split : Splits the current string into an array of words.
 * MaxRepeatingCharacter : Finds and returns the character that appears the most frequently in the current string.                    
 * Sort : Sorts the characters of the current string in alphabetical order.
 * Shift : Moves the first n characters from the start to the end of the current string.
 * Reverse : Reverses the current string.           
 * Created by - Sachin Gupta
 * Date - 4 September
 */

package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	
    public static String reverseForShift(char[] chars , int start , int end){

    	while(start < end) {
    		char temp = chars[start];
    		chars[start] = chars[end];
    		chars[end] = temp;
    		start++;
    		end--;
    	}
    	return new String(chars);
    }
    
    public static String Append(String currentString , String input) {
    	
    	String result = "";
    	result = currentString + " " + input;
    	return result;
    }
	
	public static int CountWords(String input) {
		int wordsCount = 0;
		boolean isWord = false;
		
		for(int i = 0; i < input.length(); i++) {
	        if (input.charAt(i) != ' ') {
	            if (!isWord) {
	                isWord = true;
	                wordsCount++;
	            }
	        } else {
	            isWord = false;
	        }
		}
		
		return wordsCount;
	}
	
	
	public static boolean isPalindrome(String input) {
    	char[] chars = input.toCharArray();
    	int i = 0;
    	int j = input.length()-1;
    	while(i < input.length()/2) {
    		if(!(chars[i] == chars[j])){
    			return false;
    		}
    		i++;
    		j--;
    	}
    	return true;
	}
	
	public static String Replace(String currentString) {
        
        Scanner replace = new Scanner(System.in);
        Constant constant = new Constant();
        char[] str2 = currentString.toCharArray();
        System.out.println(constant.OUTPUT1);
        String str3 = replace.nextLine();
        System.out.println(constant.OUTPUT2);
        String str4 = replace.nextLine();
        for(int i = 0; i<str2.length; i++ ) {
            if(str2[i] == str3.charAt(0)) {
                str2[i] = str4.charAt(0);
             }
         }
        return new String(str2);
    
    }
	
	public static String Splice(String input,int start,int length) {
		char[] chars = input.toCharArray();
		int count = 0;
		String result = "";
		for(int i = 0; i<input.length(); i++) {
			if(i>=start && count<2) {
				count++;
				continue;
			}
			else {
				result += chars[i];
			}
		}
		return result;
	}
	
	public static String[] Split(String input) {
		int wordCount = CountWords(input);
		String[] words = new String[wordCount];
		input = input.trim();
		String currentWord = "";
		int index = 0;
		
		for(char ch : input.toCharArray()) {
			if(ch == ' ') {
				if(!currentWord.isEmpty()) {
					
				words[index] = currentWord;
				index++;
				currentWord = "";
				}
			}
			else {
				currentWord += ch;
			}
		}
		
        if (!currentWord.isEmpty()) {
            words[index] = currentWord;
        }
		return words;
	}
	
    public static char maxRepeatingCharacter(String str) {
        int maxCount = 0;
        char maxChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        return maxChar;
    }

	public static String Sort(String input) {
		char[] chars = input.toCharArray();
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < input.length() - i - 1; j++) {
				if(chars[j] > chars[j+1]) {
					char temp = chars[j];
					chars[j] = chars[j+1];
					chars[j+1] = temp;
				}
			}
		}
		return  new String(chars);
	}	
	
	public static String Shift(String input, int position) {
		char chars[] = input.toCharArray();
		int length = input.length()-1;
		position = position % length;
		position = input.length() - position;
		reverseForShift(chars,0,position-1);	
		reverseForShift(chars,position,length);	
		reverseForShift(chars,0,length);	
		
		return new String(chars);
	
}

    public static String Reverse(String input){
    	char[] chars = input.toCharArray();
    	int i = 0;
    	int j = input.length()-1;
    	while(i < input.length()/2) {
    		char temp = chars[i];
    		chars[i] = chars[j];
    		chars[j] = temp;
    		i++;
    		j--;
    	}
    	System.out.println(chars);
    	return new String(chars);
    }
    
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a string (or 0 to exit):");
                String input = in.nextLine();
                
                if (input.equals("0")) {
                    System.out.println("Exiting...");
                    break;
                }

                System.out.println("Choose an operation:");
                System.out.println("1. Append");
                System.out.println("2. Count Words");
                System.out.println("3. Replace");
                System.out.println("4. Check Palindrome");
                System.out.println("5. Splice");
                System.out.println("6. Split");
                System.out.println("7. Max Repeating Character");
                System.out.println("8. Sort");
                System.out.println("9. Shift");
                System.out.println("10. Reverse");
                System.out.println("Enter your choice (or 0 to exit):");

                int method = in.nextInt();
                in.nextLine(); // Consume newline

                if (method == 0) {
                    System.out.println("Exiting...");
                    break;
                }

                switch (method) {
                    case 1:
                        System.out.println("Enter string to append:");
                        String toAppend = in.nextLine();
                        System.out.println(Append(input, toAppend));
                        break;

                    case 2:
                        System.out.println("Word count: " + CountWords(input));
                        break;

                    case 3:
                        System.out.println("Replaced string: " + Replace(input));
                        break;

                    case 4:
                        System.out.println("Is palindrome: " + isPalindrome(input));
                        break;

                    case 5:
                        System.out.println("Enter start index for splice:");
                        int start = in.nextInt();
                        System.out.println("Enter length for splice:");
                        int length = in.nextInt();
                        in.nextLine(); 
                        System.out.println("Spliced string: " + Splice(input, start, length));
                        break;

                    case 6:
                        System.out.println("Splitting string...");
                        String[] splitResult = Split(input);
                        System.out.println(Arrays.toString(splitResult));
                        break;

                    case 7:
                        System.out.println("Max repeating character: " + maxRepeatingCharacter(input));
                        break;

                    case 8:
                        System.out.println("Sorted string: " + Sort(input));
                        break;

                    case 9:
                        System.out.println("Enter shift position:");
                        int position = in.nextInt();
                        in.nextLine(); // Consume newline
                        System.out.println("Shifted string: " + Shift(input, position));
                        break;

                    case 10:
                        System.out.println("Reversed string: " + Reverse(input));
                        break;

                    default:
                        System.out.println("Invalid input. Please try again.");
                        break;
                }
            }
        }
    }
}
