import java.util.Scanner;

public class PowerCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		int base = sc.nextInt();
		System.out.print("\nEnter the Exponent: ");
		int exponent = sc.nextInt();
		
		double result = Math.pow(base,exponent);
		System.out.print("\nThe result of the base to the exponent: " + result);
	}
}
