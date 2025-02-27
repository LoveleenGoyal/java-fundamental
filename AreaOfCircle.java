import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double pi = Math.PI;
		System.out.print("Enter the radius of circle : ");
		int radius = sc.nextInt();
		
		double area = pi*(radius*radius);
		System.out.print("\nArea of circle is : " + area);
	}
}		
