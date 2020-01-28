import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Roll [D]ice or [F]lip coin");
		String select = input.nextLine();
		
		
		Dice dice = new Dice();
		dice.rollDice();
		System.out.println("Dice Rolled: " + dice.getResult());
		
//		if (select == "D") {
//			Dice dice = new Dice();
//			dice.rollDice();
//			System.out.println("Dice Rolled: " + dice.getResult());
//		} 
//		if (select == "F") {
//			Coin coin = new Coin();
//			coin.flipCoin();
//			System.out.println("Coin Flipped: " + coin.getResult());
//		}
		
	}
}
