/***
 * Task 3: Prime Number Checker
 * Input: 21
 * Output: "The given number is NOT prime"
 * Explanation: The number 21 is divisible by 3 and 7, hence it is not a prime number.
 * Constraints: The input will be a positive integer between 1 and 10^6.
 * Owner Name : Sachin Gupta
 * DOf : 3/9/2024
 *  ***/

package Assignment_1;

import java.util.Scanner;

public class Task3 {
	
	public static void PrimeChecker(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Number is not prime");
        } else {
            System.out.println("Number prime");
        }
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Constant constant = new Constant();
		
		while(true) {
			try {
				System.out.println(constant.Task3);
				int n = in.nextInt();
				PrimeChecker(n);
			} catch (Exception e) {
				System.out.println("Invalid Number");
				break;
			}
			
		}
		
		
	}

}

