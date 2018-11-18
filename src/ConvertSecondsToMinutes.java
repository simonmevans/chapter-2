import java.util.*;
public class ConvertSecondsToMinutes {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Seconds");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int leftOverSeconds = seconds % 60;
		System.out.println("Thats " + minutes + " minute(s) and " + leftOverSeconds + " second(s)");
	}

}
