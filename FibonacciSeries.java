/**
 * FibonacciSeries
 * 
 * Program to display fibonacci series
 * upto user specified limit.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter limit for fibonacci series : ");
		int limitFib = sc.nextInt();
		
		int num1=0;
		int num2=1;
		int result=0;
		
		for(int i =1; i<=limitFib-2; i++) {
			
			if(i==1) {
				System.out.println(num1);
			}
			else if(i==2) {
				System.out.println(num2);
			}
			result = num1 + num2;
			System.out.println(result);
			// swapping the number for next iteration
			num1=num2; 
			num2=result;
		}
	}
}
