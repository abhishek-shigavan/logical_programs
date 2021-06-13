/**
 * PrimeNumber
 * 
 * Program to check user given number is
 * Prime number or not.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class PrimeNumber {
/**
 * 
 * This method takes number as input
 * and check if it is prime or not   
 * 
 * Returns true if no is prime else false
 * 
 * @return boolean value true or false
 *  
 */
	public static boolean isPrimeNumber(int number) {
		
		boolean flag =true;
		
		if(number == 0 || number == 1 ) {
			flag = false;
		}
		
		for(int i =2; i <= number/2; i++) {
			
			if(number%i == 0) {
				flag = false;	
			} 
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no to check : ");
		int inputNumber = sc.nextInt();
		
		boolean primeResult = isPrimeNumber(inputNumber);
		
		if(primeResult == true) {
			System.out.println(inputNumber+" is a Prime Number");
		}
		else {
			System.out.println(inputNumber+" is not a Prime Number");
		}
	}

}
