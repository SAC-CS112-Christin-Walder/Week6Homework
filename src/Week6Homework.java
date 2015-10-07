import java.util.Scanner;

public class Week6Homework
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int user = 0;
		int computer;
		
		System.out.print("Rock, paper or scissors?: ");
		String userInput=input.next();
		
		userInput = userInput.toUpperCase();
		if (userInput.equals("ROCK") || userInput.equals("PAPER") || userInput.equals("SCISSORS"))
		{
			if (userInput.equals("ROCK"))
				user = 1;
			else if (userInput.equals("PAPER"))
				user = 2; 
			else if (userInput.equals("SCISSORS"))
				user = 3;
				
			
			computer = 1 + (int)(Math.random() * 3);
				if (computer==1)
					System.out.println("Computer: Rock");
				else if (computer==2)
					System.out.println("Computer: Paper");
				else if (computer==3)
					System.out.println("Computer: Scissors");
			
			if (user==computer)
				System.out.println("It's a tie!");
			else if ((user==1 && computer==2)||(user==2 && computer==1))
				System.out.println("The computer wins!");
			else if ((user==1 && computer==3)||(user==3 && computer==1))
				System.out.println("You win!");
			else if ((user==2 && computer==3)||(user==3 && computer==2))
				System.out.println("The computer wins!");
			//How to stop program and loop back around for invalid selection
		}
		else 
			System.out.println("Invalid selection");
		
	}

}