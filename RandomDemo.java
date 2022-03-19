import java.util.Random;
import java.util.Scanner;

public class RandomDemo {

	public static void main(String[] args) {
		int ans,guess;
		final int max = 10;
		
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		ans = rand.nextInt(max)+1;
		
		System.out.print("Enter a number between 1 and 10 : ");
		guess = in.nextInt();
		if(guess==ans) {
			System.out.println("Congratulations ! You have won the Game.The number was : "+ans);
		}
		else {
			System.out.println("Sorry ! You lose the game. The number was : "+ans);
		}

	}

}
