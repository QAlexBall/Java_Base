import java.util.*;

public class AddingGroups {
	public static void main(String [] args) {
		Collection<Integer> collection =
			new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = {6, 7, 8, 9, 10};
		Collections.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 20); // -- modigy an element
		System.out.println(list.set(0, 99));
		System.out.println(list);
		System.out.println(collection);
	}
}