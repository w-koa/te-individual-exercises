import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharpChromaticScaleC implements ChromaticScale{

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

	// Getter Overrides
	
	@Override
	public Map<String, Integer> getChromaticScale() {
		// TODO Auto-generated method stub
		return sharpChromaticScaleC;
	}

	@Override
	public List<String> getChromaticNotes() {
		List<String> sharpNotes = new ArrayList<String>(sharpChromaticScaleC.keySet());
		return sharpNotes;
	}

	@Override
	public List<Integer> getChromaticValues() {
		List<Integer> sharpValues = new ArrayList<Integer>();
		for (String key : sharpChromaticScaleC.keySet()) {
			sharpValues.add(sharpChromaticScaleC.get(key));
		}
		return sharpValues;
	}

	
}
