import java.util.Scanner;

public class NonObjectRolling {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Flip [C]oin or Roll [D]ice or enter to exit: ");
		String choice = input.nextLine();
		String flip = "C";
		String roll = "D";
		String exit = "";
		while (!choice.equals(flip) || !choice.equals(roll) || !choice.equals(exit)) {
			System.out.println("Flip [C]oin or Roll [D]ice or enter to exit: ");
			choice = input.nextLine();
			
			if (choice.equals(flip)) {
				int flipResult = (int) (Math.random() * 2) + 1;
				if (flipResult == 1) {
					System.out.println("\nCoin landed: Heads");			
				} System.out.println("\nCoin landed: Tails");
			}
			
			if (choice.equals(roll)) {
				int rollResult = (int) (Math.random() * 6) + 1;
				System.out.println("\nDice Rolled: " + rollResult);
			}
			if (choice.equals(exit)) {
				break;
			}

		}
		input.close();
//		if (choice.equals(flip)) {
//			int flipResult = (int) (Math.random() * 2) + 1;
//			if (flipResult == 1) {
//				System.out.println("Coin landed: Heads");			
//			} System.out.println("Coin landed: Tails");
//		}
//		
//		if (choice.equals(roll)) {
//			int rollResult = (int) (Math.random() * 6) + 1;
//			System.out.println("Dice Rolled: " + rollResult);
//		}

	}

}
