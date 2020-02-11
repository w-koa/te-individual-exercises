import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Testing {

	// Sort logic
	// Updates entries so that key at pivot = 0.
	// Adds 12 to key values that are less than entry at pivot.
	public static void asdf(Map<String, Integer> source, int pivot) {
		List<Entry<String, Integer>> list = source.entrySet().stream().map(entry -> {
			return updateEntry(source, pivot, entry);
		}).sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
	}

	private static Entry<String, Integer> updateEntry(Map<String, Integer> source, int pivot,
			Entry<String, Integer> entry) {
		if (entry.getValue() < pivot) {
			entry.setValue(entry.getValue() + source.size());
		}
		entry.setValue(entry.getValue() - pivot);
		return entry;
	}

	// Sorts by ascending value and puts into new Map, sortedMap.
	// Must use sortedMap from here on out if you want it in order.
	// Remember to clear sortedMap before trying to add new values!
	static LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

	private static void sortAscending(Map<String, Integer> source) {
		source.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	}

	// Major scale extraction method
	// Takes a chromatic scale and returns sortedMap containing major scale
	public static Map<String, Integer> getMajorScale(ChromaticScale sourceChromatic) {
		sortedMap.clear();
		Map<String, Integer> tempMap = sourceChromatic.getChromaticScale();
		sortAscending(tempMap);
		
		Map<String, Integer> extractedMajor = new HashMap<String, Integer>();
		int[] majorValues = { 0, 2, 4, 5, 7, 9, 11 };
		for (int i = 0; i < majorValues.length; i++) {
			for (String noteName : sortedMap.keySet()) {
				if (sortedMap.get(noteName).equals(majorValues[i])) {
					extractedMajor.put(noteName, majorValues[i]);
					break;
				} 
			}
		}
		sortedMap.clear();
		sortAscending(extractedMajor);
		System.out.println(sortedMap);
		return sortedMap;
	}
	
	
	// Natural Minor Scale extractor method
	// Takes a chromatic scale and returns sortedMap as natural minor...
	// ...problem is that it uses sharps or flats always depending on input ChromaticScale.
	public static Map<String, Integer> getNaturalMinorScale(ChromaticScale sourceChromatic) {
		sortedMap.clear();
		Map<String, Integer> tempMap = sourceChromatic.getChromaticScale();
		sortAscending(tempMap);
		
		Map<String, Integer> extractedMajor = new HashMap<String, Integer>();
		int[] naturalMinorValues = { 0, 2, 3, 5, 7, 8, 10 };
		for (int i = 0; i < naturalMinorValues.length; i++) {
			for (String noteName : sortedMap.keySet()) {
				if (sortedMap.get(noteName).equals(naturalMinorValues[i])) {
					extractedMajor.put(noteName, naturalMinorValues[i]);
					break;
				} 
			}
		}
		sortedMap.clear();
		sortAscending(extractedMajor);
		System.out.println(sortedMap);
		return sortedMap;
	}
	
	// Minor Scale extractor method
	// Takes a chromatic scale and returns sortedMap as harmonic minor...
	// ...problem is that it uses sharps or flats always depending on input ChromaticScale.
	public static Map<String, Integer> getHarmonicMinorScale(ChromaticScale sourceChromatic) {
		sortedMap.clear();
		Map<String, Integer> tempMap = sourceChromatic.getChromaticScale();
		sortAscending(tempMap);
		
		Map<String, Integer> extractedMajor = new HashMap<String, Integer>();
		int[] naturalMinorValues = { 0, 2, 3, 5, 7, 8, 11 };
		for (int i = 0; i < naturalMinorValues.length; i++) {
			for (String noteName : sortedMap.keySet()) {
				if (sortedMap.get(noteName).equals(naturalMinorValues[i])) {
					extractedMajor.put(noteName, naturalMinorValues[i]);
					break;
				} 
			}
		}
		sortedMap.clear();
		sortAscending(extractedMajor);
		System.out.println(sortedMap);
		return sortedMap;
	}
	public static void main(String[] args) {

		Map<String, Integer> testing = new HashMap<String, Integer>();

		testing.put("C", 0);
		testing.put("C#", 1);
		testing.put("D", 2);
		testing.put("D#", 3);
		testing.put("E", 4);
		testing.put("F", 5);
		testing.put("F#", 6);
		testing.put("G", 7);
		testing.put("G#", 8);
		testing.put("A", 9);
		testing.put("A#", 10);
		testing.put("B", 11);

		System.out.println("Before asdf " + testing);
		asdf(testing, 4);
		System.out.println("after asdf " + testing);
		sortAscending(testing);
		System.out.println("After sortAscending " + sortedMap);

		sortedMap.clear();
		SharpChromaticScaleC chromaTest = new SharpChromaticScaleC();

		System.out.println("chromatest map: " + chromaTest.getChromaticScale());
		asdf(chromaTest.getChromaticScale(), 11);
		System.out.println("Changed to B chromatic: " + chromaTest.getChromaticScale());

		sortAscending(chromaTest.getChromaticScale());
		System.out.println("Sorted B Chromatic: " + sortedMap);

		sortedMap.clear();

		FlatChromaticScaleC flatChroma = new FlatChromaticScaleC();

		System.out.println(flatChroma.getFlatChromaticScaleC());
		asdf(flatChroma.getFlatChromaticScaleC(), 5);
		System.out.println("Flat Chromatic asdf: " + flatChroma.getFlatChromaticScaleC());
		sortAscending(flatChroma.getFlatChromaticScaleC());
		System.out.println("Flat chromatic in sortedMap: " + sortedMap);
		System.out.println(sortedMap.keySet());
		sortedMap.clear();
		SharpChromaticScaleC shuffleTest = new SharpChromaticScaleC();
		Collections.shuffle(shuffleTest.getChromaticNotes());
		System.out.println(shuffleTest.getChromaticScale());
		System.out.println(shuffleTest.getChromaticValues());
		asdf(shuffleTest.getChromaticScale(), 5);
		sortAscending(shuffleTest.getChromaticScale());
		System.out.println(sortedMap);
		System.out.println(shuffleTest.getChromaticScale());
		getMajorScale(shuffleTest);
		getNaturalMinorScale(flatChroma);
		getMajorScale(flatChroma);

//		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
//		testing.entrySet()
//	    .stream()
//	    .sorted(Map.Entry.comparingByValue())
//	    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
//		System.out.println(testing);
//		System.out.println(" new map " + sortedMap);
//		Map<String, Integer> newChromatic = new HashMap<String, Integer>();
//		
//		List<Integer> chromaticValue = new ArrayList<>();
//		
//		for (Map.Entry<String, Integer> test : testing.entrySet()) {
//			if (test.getValue() < 0) {
//				
//				testing.put(test.getKey(), test.getValue() + 12);
//			}
//			chromaticValue.add(test.getValue());
//			newChromatic.put(test.getKey(), test.getValue());
//		}
//		
//		
//		
//		System.out.println("Chromatic value list: " + chromaticValue);
//		System.out.println("new Chomatic: " + newChromatic);
//		Collections.sort(chromaticValue);
//		System.out.println("Sorted chromatic value list: " + chromaticValue);
//		
//		for (int i = 0; i < chromaticValue.size(); i++) {
//			System.out.println(newChromatic);
//		}
//		
//		System.out.println(testing);
//		System.out.println(newChromatic);
//		System.out.println(
//				testing.entrySet()
//				.stream()
//				.sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));
//		testing.entrySet()
//		.stream()
//		.sorted(Map.Entry.comparingByValue())
//		.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
//		System.out.println(sortedMap);
	}
}
