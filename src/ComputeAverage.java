import java.util.Scanner;
public class ComputeAverage {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers I will find the average");
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		System.out.println("The average of the three numbers is : " + (one + two + three) / 3);
		
	}
	
}
