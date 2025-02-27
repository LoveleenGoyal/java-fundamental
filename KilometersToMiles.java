import java.util.Scanner;

public class KilometersToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the distance (in KMs): ");
		int distance = sc.nextInt();
		
		double miles = distance * 0.621371;
		System.out.print("\nThe distance converted in miles is : " + miles);
	}
}
