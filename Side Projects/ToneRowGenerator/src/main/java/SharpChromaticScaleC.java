import java.util.HashMap;
import java.util.Map;

public class SharpChromaticScaleC {

	// Attributes
	private Map<String, Integer> sharpChromaticScaleC = new HashMap<String, Integer>();

	//Constructor for SharpChromatic Scale
	public SharpChromaticScaleC() {

		sharpChromaticScaleC.put("C", 0);
		sharpChromaticScaleC.put("C#", 1);
		sharpChromaticScaleC.put("D", 2);
		sharpChromaticScaleC.put("D#", 3);
		sharpChromaticScaleC.put("E", 4);
		sharpChromaticScaleC.put("F", 5);
		sharpChromaticScaleC.put("F#", 6);
		sharpChromaticScaleC.put("G", 7);
		sharpChromaticScaleC.put("G#", 8);
		sharpChromaticScaleC.put("A", 9);
		sharpChromaticScaleC.put("A#", 10);
		sharpChromaticScaleC.put("B", 11);
	}

	// Getter
	public Map<String, Integer> getSharpChomaticScaleC() {
		return sharpChromaticScaleC;
	}
}
