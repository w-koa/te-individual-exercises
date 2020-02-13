import java.util.Scanner;

public class ToneRowGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Determine if sharp or flat key. Re-prompts if invalid.
		boolean keySelect = false;
		boolean selectedSharpKey = false;
		SharpChromaticScaleC userSharpScale = new SharpChromaticScaleC();
		FlatChromaticScaleC userFlatScale = new FlatChromaticScaleC();
		while (!keySelect) {
			System.out.println("Please enter if this is Sharp(#) or Flat(b) key: ");
			String keyType = input.nextLine();
			if (keyType.equals("#")) {
				keySelect = true;
				selectedSharpKey = true;
				System.out.println("Sharp Selected");
			}
			if (keyType.contentEquals("b")) {
				keySelect = true;
				System.out.println("Flat Selected");
			}
		}

		// Get user input for tone row. (WRITE SOMETHING TO CHECK IF VALID)
		System.out.println("\nPlease enter a tone row. Example of format: A, B, C, D, E, F, G, C#, D#, F#, G#, A#."
				+ "\nAssigns chromatic values based on the order of note names."
				+ "\nYou can use either note names (C-B) or chromatic values (0 - 11).");
		String row = input.nextLine();
		
		// Updates map values for Sharp Key based on user input
		if (row.contains("C") && selectedSharpKey) {
			String[] rowSplit = row.split(", ");
			int i = 0;
			for (String note : rowSplit) {
				userSharpScale.getChromaticScale().put(note, i);
				i++;
			}
		}
		// Updates map values for Flat Key based on user input
		if (row.contains("C") && !selectedSharpKey) {
			String[] rowSplit = row.split(", ");
			int i = 0;
			for (String note : rowSplit) {
				userFlatScale.getChromaticScale().put(note, i);
				i++;
			}
		}
		
		// Orders map key by values entered

		System.out.println(userSharpScale.getChromaticScale());

		input.close();
	}

}
