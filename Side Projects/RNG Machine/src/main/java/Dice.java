
public class Dice {
	// Attributes
	private int result;
	
	// Constructor
	public Dice() {
		this.result = 1;
	}

	// Getter
	public int getResult() {
		return result;
	}
	
	// Methods
	public int rollDice() {
		return this.result = (int) (Math.random() * 6) + 1;
	}
	
}
