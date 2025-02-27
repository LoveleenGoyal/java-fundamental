import java.util.Scanner;

public class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double pi = Math.PI;
		System.out.print("Enter the height of cylinder : ");
		int height = sc.nextInt();
		System.out.print("\nEnter the radius of cylinder: ");
		int radius = sc.nextInt();
		
		double volume = pi*(radius*radius)*height;
		System.out.print("\nVolume of cylinder is " + volume);
	}
}

