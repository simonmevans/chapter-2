import java.util.Scanner;
public class RadiusOfCircle {
	public static void main(String [] args) {
	//create the scanner
	Scanner input = new Scanner(System.in);
	//get double input to get radius
	double radius = 0;//declare radius for input
	System.out.println("Enter radius of circle and I will find area :");
	radius = input.nextDouble();
	System.out.println("you entered :" + radius);
	double area = radius * radius * 3.14159;
	System.out.println("The solution is : " + area);
	}
}
