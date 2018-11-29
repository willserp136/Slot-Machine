import java.util.*;
public class Slot_Machine
{
	public static void main (String [] args)
	{

		//Scanner to determine if to continue or not

		Scanner keyboard = new Scanner (System.in);
		String answer;

		//Scanner to determine value for tokens

		Scanner token = new Scanner (System.in);
		System.out.println ("Input how many tokens you have to play with today.");
		int tokens = token.nextInt();

		//Slot Machine start and Key
		System.out.println ("Welcome to the Wentworth Slot Machine!");
		System.out.println("-1 equals Blank");
		System.out.println("-2 equals Cherry");
		System.out.println("-3 equals Bar");
		System.out.println("-4 equals Double Bar");
		System.out.println("-5 equals Triple Bar");
		System.out.println("-6 equals Red 7");
		System.out.println("-7 equals Jackpot");
		System.out.println ("--Slot Machine--");
		System.out.println("You have " + tokens + " tokens. Each pull costs 1 token. Would you like to play? (Y for yes, N for no)");

		answer = keyboard.next ();

		int wheel[][] = new int[3][2];

		while (answer.equalsIgnoreCase ("Y"))
		{
			do
			{

				//Random number generator for the wheels

				wheel[0][0] = (int) (Math.random() * ((128 - 1) + 1)) + 1;
				wheel[1][0] = (int) (Math.random() * ((128 - 1) + 1)) + 1;
				wheel[2][0] = (int) (Math.random() * ((128 - 1) + 1)) + 1;

				// The value for each random number generated by the wheels
				for(int i = 0; i<wheel.length;i++)
				{
					if(wheel[i][0] >=0 && wheel[1][0] <=73)
					{
						wheel[i][1] = -1;
					}
					else if(wheel[i][0] >= 74 && wheel[i][0] <=78)
					{
						wheel[i][1] = -2;
					}
					else if(wheel[i][0] >= 79 && wheel[i][0] <=94)
					{
						wheel[i][1] = -3;
					}
					else if(wheel[i][0] >= 95 && wheel[i][0] <=107)
					{
						wheel[i][1] = -4;
					}
					else if(wheel[i][0] >= 108 && wheel[i][0] <=118)
					{
						wheel[i][1] = -5;
					}
					else if(wheel[i][0] >= 119 && wheel[i][0] <=126)
					{
						wheel[i][1] = -6;
					}
					else if(wheel[i][0] >= 127 && wheel[i][0] <=128)
					{
						wheel[i][1] = -7;
					}	
				}

				//Tokens taken away for each roll

				tokens-=1;

				//Winning combinations for 3 of a kind

				if(wheel[0][1] == wheel[1][1] && wheel[1][1] == wheel[2][1])
				{

					if(wheel[1][1] == -2)
					{
						tokens += 12;
						System.out.println("Congratulations! You've won 12 tokens!");
					}
					else if(wheel[1][1] == -3)
					{
						tokens += 25;
						System.out.println("Congratulations! You've won 25 tokens!");
					}
					else if(wheel[1][1] == -4)
					{
						tokens += 50;
						System.out.println("Congratulations! You've won 50 tokens!");
					}
					else if(wheel[1][1] == -5)
					{
						tokens += 100;
						System.out.println("Congratulations! You've won 100 tokens!");
					}
					else if(wheel[1][1] == -6)
					{
						tokens += 300;
						System.out.println("Congratulations! You've won 300 tokens!");
					}
					else if(wheel[1][1] == -7)
					{
						tokens += 1666;
						System.out.println("Congratulations! You've won 1666 tokens!");
					}
				}

				//Winning combination of two cherries

				if (wheel[0][1] == wheel[1][1] || wheel[1][1] == wheel[2][1] || wheel[0][1] == wheel[2][1])
				{
					if(wheel[0][1] == -2 && wheel[1][1] == -2)
					{
						tokens += 6;
						System.out.println("Congratulations! You've won 6 tokens!");
					}
					else if(wheel[1][1] == -2 && wheel[2][1] == -2)
					{
						tokens += 6;
						System.out.println("Congratulations! You've won 6 tokens!");
					}
					else if(wheel[0][1] == -2 && wheel[2][1] == -2)
					{
						tokens += 6;
						System.out.println("Congratulations! You've won 6 tokens!");
					}
				}

				//Winning combination for three different types of Bar

				if (wheel[0][1] == wheel[0][1] || wheel[1][1] == wheel[1][1] || wheel[2][1] == wheel[2][1])
				{
					if(wheel[0][1] == -3 && wheel[0][1] == -4 && wheel[0][1] == -5)
					{
						tokens += 12;
						System.out.println("Congratulations! You've won 12 tokens!");
					}

					else if(wheel[0][1] == -3 && wheel[0][1] == -5 && wheel[0][1] == -4)
					{
						tokens += 12;
						System.out.println("Congratulations! You've won 12 tokens!");
					}
					else if(wheel[0][1] == -4 && wheel[0][1] == -5 && wheel[0][1] == -3)
					{
						tokens += 12;
						System.out.println("Congratulations! You've won 12 tokens!");
					}
					else if(wheel[0][1] == -4 && wheel[0][1] == -3 && wheel[0][1] == -5)
					{
						tokens += 12;
						System.out.println("Congratulations! You've won 12 tokens!");
					}
					else if(wheel[0][1] == -5 && wheel[0][1] == -4 && wheel[0][1] == -3)
					{
						tokens += 12;
						System.out.println("Congratulations! You've won 12 tokens!");
					}
					else if(wheel[0][1] == -5 && wheel[0][1] == -4 && wheel[0][1] == -3)
					{
						tokens += 12;
						System.out.println("Congratulations! You've won 12 tokens!");
					}
				}

				//Winning combination for one cherry 

				if (wheel[0][1] == wheel[0][1] || wheel[1][1] == wheel[1][1] || wheel[2][1] == wheel[2][1])
				{

					if(wheel[0][1] == -2 && wheel[1][1] != -2 && wheel[2][1] != -2)
					{
						tokens += 3;
						System.out.println("Congratulations! You've won 3 tokens!");
					}
					else if(wheel[1][1] == -2 && wheel[0][1] != -2 && wheel[2][1] != -2)
					{
						tokens += 3;
						System.out.println("Congratulations! You've won 3 tokens!");
					}
					else if(wheel[2][1] == -2&& wheel[0][1] != -2 && wheel[1][1] != -2)
					{
						tokens += 3;
						System.out.println("Congratulations! You've won 3 tokens!");
					}
				}

				//Output after every roll

				System.out.println(wheel[0][1] + " " + wheel[1][1] + " " + wheel[2][1]);
				System.out.println("Would you like to play again? You have " + tokens + " tokens.");
				answer = keyboard.next();
			}while(answer.toLowerCase().equals("y"));	

			//Output if loop is ended

			if (answer.toLowerCase().equals("n"));
			{
				System.out.println("Thanks for playing! You ended with " + tokens + " tokens!");
			}
		}
	}
}
