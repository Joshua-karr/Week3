import java.util.Scanner;

public class practice {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int random = 1 + (int) (Math.random() * 10001);

		System.out.println("Please enter a number between 1 and 10000");
		int userInput = input.nextInt();

		while (userInput != random) {

			if (userInput < 1 || userInput > 10000) {
				System.out.println("You have input an invalid number, please input a number between 1 and 10000");
				userInput = input.nextInt();
			} else if (userInput > random) {
				System.out.println("The number is lower than your guess of " + userInput + ", Please guess again!");
				userInput = input.nextInt();
			} else if (userInput < random) {
				System.out.println("The number is higher than your guess of " + userInput + ", Please guess again!");
				userInput = input.nextInt();
			}
		}
		if (userInput == random) {
			System.out.println("Winner, " + "The number was " + random);
		}
	}
}
