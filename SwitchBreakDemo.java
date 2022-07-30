import java.util.Scanner;


public class SwitchBreakDemo {
	public static void main(String[] args) {
		int age;
		try (Scanner inputDevice = new Scanner(System.in)) {
			System.out.print("Please enter Age: ");
			age = inputDevice.nextInt();
		}
		switch (age){
		case 10:
		case 15:
		case 17:
			System.out.println("You are not eligible for voting");
			break;
		case 18:
			System.out.println("You are eligible for voting");
		}				
	}
}
