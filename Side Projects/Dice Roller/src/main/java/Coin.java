
public class Coin {

	//Attributes
	private String result;
	
	
	//Constructor
	public Coin() {
		this.result = "Heads";
	}
	
	
	// Getter
	public String getResult() {
		return result;
	}
	
	// Method
	public String flipCoin() {
		int flipResult = (int) (Math.random() * 2) + 1;
		if (flipResult == 1) {
			return "Heads";			
		} else return "Tails";
		
	}
	
	
}
