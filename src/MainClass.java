import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Guess the number i'm thinking of. It's between 1-10");
		Scanner keyboard = new Scanner(System.in);

		int number1 = 0 + (int) ( Math.random() * 10 );
		int input = 20;

		do {
			input = keyboard.nextInt();

			if (input == number1) 
			{
				System.out.println("You're right.");
			}
			else  
			{
				System.out.println("Wrong.");
				if(input < number1 && input < 1)
				{
					System.out.println("Numbers below 1 are not valid. Choose a higher number");
				}
				else if(input > number1 && input > 10)
				{
					System.out.println("Numbers higher than 10 are not valid. Choose a lower number");
				}
			}
		}while (input != number1);

	}
}

