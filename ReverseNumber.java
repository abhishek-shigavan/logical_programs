/**
 * ReverseNumber
 * 
 * Program to take number from user
 * and display reverse of it.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to reverse :");
		int number = sc.nextInt();
		
		int reverseResult = reverseNumber(number);
		System.out.println("Given number : "+number+"  Reverse number : "+reverseResult);
	}
	
/**
 * 
 * This method reverse the input
 * number 
 * 
 * @return returning reverse number
 *         
 */	
	public static int reverseNumber(int number) {
		int remainder = 0;
		int reverseNumber = 0;
		int tempNumber = number;
		
		while(tempNumber > 0) {   
			remainder = tempNumber%10;	 
			reverseNumber = reverseNumber*10 + remainder;  
			tempNumber = tempNumber /10;    
		}
	
		return reverseNumber;
	}
}
