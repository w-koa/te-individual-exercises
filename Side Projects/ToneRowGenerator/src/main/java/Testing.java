import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Testing {
	
	//Sort logic
	//
	public static void asdf(Map<String, Integer> source, int pivot) {
		List<Entry<String, Integer>> list = source.entrySet()
				.stream()
					.map(entry -> {
						return updateEntry(source, pivot, entry);
					})
					.sorted(Map.Entry.comparingByValue())
					.collect(Collectors.toList());
	}

	private static Entry<String, Integer> updateEntry(Map<String, Integer> source, int pivot,
			Entry<String, Integer> entry) {
		if (entry.getValue() < pivot) { entry.setValue(entry.getValue() + source.size()); }
		entry.setValue(entry.getValue() - pivot);
		return entry;
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
		
		
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		testing.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByValue())
	    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		System.out.println(testing);
		System.out.println(" new map " + sortedMap);
		Map<String, Integer> newChromatic = new HashMap<String, Integer>();
		
		List<Integer> chromaticValue = new ArrayList<>();
		
		for (Map.Entry<String, Integer> test : testing.entrySet()) {
			if (test.getValue() < 0) {
				
				testing.put(test.getKey(), test.getValue() + 12);
			}
			chromaticValue.add(test.getValue());
			newChromatic.put(test.getKey(), test.getValue());
		}
		
		
		
		System.out.println("Chromatic value list: " + chromaticValue);
		System.out.println("new Chomatic: " + newChromatic);
		Collections.sort(chromaticValue);
		System.out.println("Sorted chromatic value list: " + chromaticValue);
		
		for (int i = 0; i < chromaticValue.size(); i++) {
//			System.out.println(newChromatic);
		}
		
		System.out.println(testing);
		System.out.println(newChromatic);
		System.out.println(
				testing.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));
//		testing.entrySet()
//		.stream()
//		.sorted(Map.Entry.comparingByValue())
//		.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		System.out.println(sortedMap);
	}
}
