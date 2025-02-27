import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Principal amount: ");
		int principal = sc.nextInt();
		System.out.print("\nEnter the Rate of Interest: ");
		int rate = sc.nextInt();
		System.out.print("\nEnter the Time (in years): ");
		int time = sc.nextInt();
		
		float simpleInterest = (principal*rate*time)/100;
		System.out.print("\nThe simple interest is : " + simpleInterest);
	}
}

