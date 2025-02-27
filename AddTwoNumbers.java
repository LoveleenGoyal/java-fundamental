import java.util.Scanner;

public class AddTwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter second number: ");
		int num2 = sc.nextInt();
		
		int add = num1 + num2;
		System.out.print("\nThe sum of " + num1 + " and " + num2 + " is " + add);
	}
}