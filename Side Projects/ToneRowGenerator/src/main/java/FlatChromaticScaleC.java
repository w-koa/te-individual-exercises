import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatChromaticScaleC implements ChromaticScale {

	// Attributes
	private Map<String, Integer> flatChromaticScaleC = new HashMap<String, Integer>();

	// Constructor
	public FlatChromaticScaleC() {

		flatChromaticScaleC.put("C", 0);
		flatChromaticScaleC.put("Db", 1);
		flatChromaticScaleC.put("D", 2);
		flatChromaticScaleC.put("Eb", 3);
		flatChromaticScaleC.put("E", 4);
		flatChromaticScaleC.put("F", 5);
		flatChromaticScaleC.put("Gb", 6);
		flatChromaticScaleC.put("G", 7);
		flatChromaticScaleC.put("Ab", 8);
		flatChromaticScaleC.put("A", 9);
		flatChromaticScaleC.put("Bb", 10);
		flatChromaticScaleC.put("B", 11);
	}

	// Getter
	public Map<String, Integer> getFlatChromaticScaleC() {
		return flatChromaticScaleC;
	}

	@Override
	public Map<String, Integer> getChromaticScale() {

		return flatChromaticScaleC;
	}

	@Override
	public List<String> getChromaticNotes() {
		List<String> flatNotes = new ArrayList<String>(flatChromaticScaleC.keySet());
		return flatNotes;
	}

	@Override
	public List<Integer> getChromaticValues() {
		List<Integer> flatValues = new ArrayList<Integer>();
		for (String key : flatChromaticScaleC.keySet()) {
			flatValues.add(flatChromaticScaleC.get(key));
		}
		return flatValues;
	}


}
