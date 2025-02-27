import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of a rectangle: ");
		int length = sc.nextInt();
		System.out.print("\nEnter the width of a rectangle: ");
		int width = sc.nextInt();
		
		int perimeter = 2 * (length + width);
		System.out.print("\nPerimeter of a rectangle is: " + perimeter);
	}
}