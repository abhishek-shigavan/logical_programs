/**
 * PerfectNumber
 * 
 * Program to check user given number is
 * perfect number or not.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no to check for perfect no : ");
		int number = sc.nextInt();
		
		int perfectSum = isPerfect(number);
		
		if(perfectSum == number) {
			System.out.println(number +" is perfect number");
		}
		else {
			System.out.println(number +" is not a perfect number");
		}
	}
	
/**
 * 
 * This method computes the factor of
 * number and add them 
 * 
 * @return returning the sum of the factors
 *         of number
 */	
	public static int isPerfect(int number) {
		
		int sum = 0;
		for(int i=1; i<= number/2; i++) {
			
			if(number%i == 0) {
				
				sum += i;
			}
		}
		return sum;
		
	}
}
