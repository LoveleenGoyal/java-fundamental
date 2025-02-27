import java.util.Scanner;

public class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.print("\nEnter the 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.print("\nEnter the 3rd number: ");
		int num3 = sc.nextInt();
		
		int average = (num1 + num2 + num3)/3;
		System.out.print("\nThe average of three numbers is : " + average);
	}
}

		
