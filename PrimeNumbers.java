/*
 * 
 * Author: Daniel Lee
 * Date: 06/19/2020
 * Program: Prime number counter
 * Description: Generates random bounds and counts up the prime numbers that exist within those bounds.
 * 
 * 
 */

import java.util.Random;

public class PrimeNumbers {
	public static void main(String[] args) {
		/*
		 * variables to keep track of count/'prime-ness'
		 */
		boolean isPrime = true;
		int primeCount = 0;
		
		/*
		 * initialize the random upper/lower limits
		 */
	    int upperLimit = (int) (51 * Math.random());
		int lowerLimit = (int) -(51 * Math.random());
		
		/*
		 * main algorithm to check each number within the bounds for 'prime-ness'
		 */
		System.out.println("Checking for prime numbers between " + lowerLimit + " and " + upperLimit + "...");
		for(int i = lowerLimit; i < upperLimit + 1; i++) {
			for(int j = 2; j < (i - 1); j++) {
				if(i % j == 0) {
					isPrime = false; 
				}
			}
			if(isPrime == true && i > 1) { 
				System.out.println("Prime number found: " + i + "."); 
				primeCount++; //add to the total
			}
			isPrime = true; //reset for next instance
		}
		
		/*
		 * summarize the findings for the user
		 */
		System.out.println("The number of prime numbers between " + 
							lowerLimit + " and " + upperLimit + " is " + primeCount + ".");
	}
	
}
