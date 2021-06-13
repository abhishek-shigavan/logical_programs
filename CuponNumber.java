/**
 * CupponNumber
 * 
 * Program to count how many random number
 * required to generate user given Cupon Code.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class CuponNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no of cupon : ");
		int totalCupon = sc.nextInt();
		
		int flag =0;
		int counter =0;
		int totalCounter =0;	
		
		for(int i =1; i <= totalCupon; i++) {
			
			int cuponNumber = (int)(Math.floor(Math.random() * 1000) % 1000)+1; //3 digit random number
			
			while(flag == 0) {
				
				counter++;	//counting random numbers
				int randomNumber = (int)(Math.floor(Math.random() * 1000) % 1000)+1;
				
				// checking for match
				if(randomNumber == cuponNumber) {
					flag =1;
				}
			}
			
			totalCounter += counter;	//adding count to total count
			
			// again setting it to 0 for next iteration
			flag = 0;
			counter =0;
		}
		System.out.println("For "+totalCupon+" Cupon Number :- Total Random Number required : "+totalCounter);
	}
}
