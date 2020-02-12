import java.util.Scanner;

public class ToneRowGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Determine if sharp or flat key. Re-prompts if invalid.
		boolean keySelect = false;
		while (!keySelect) {
			System.out.println("Please enter if this is Sharp(#) or Flat(b) key: ");
			String keyType = input.nextLine();
			if (keyType.equals("#")) {
				SharpChromaticScaleC sharpScale = new SharpChromaticScaleC();
				keySelect = true;
				System.out.println("Sharp Selected");
			}
			if (keyType.contentEquals("b")) {
				FlatChromaticScaleC flatScale = new FlatChromaticScaleC();
				keySelect = true;
				System.out.println("Flat Selected");
			} 
		}
		// Get user input for tone row. (WRITE SOMETHING TO CHECK IF VALID)
		System.out
				.println("\nPlease enter a tone row. You can use either note names (C-B) or chromatic values (0 - 11): ");
		String row = input.nextLine();

		input.close();
	}

}
