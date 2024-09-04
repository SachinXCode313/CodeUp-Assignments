package Assignment_2;

import java.util.Scanner;

public class Assignment2 {
	
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
    	return new String(chars);
    }
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			while(true) {
//				System.out.print(constant.Task1);
				String input = in.nextLine();
//				String result = Reverse(input);
//				Boolean ans = isPalindrome(input);
//				int wordCount = CountWords(input);
				String sortedText = Sort(input);
				System.out.println(sortedText);
			}
		} catch (Exception e) {
			System.out.println("Enter a valid string");
		}
	}
}
