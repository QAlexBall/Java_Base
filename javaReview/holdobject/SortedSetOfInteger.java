import java.util.*;

public class SortedSetOfInteger {
	public static void main(String [] args) {
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++ )
			intset.add(rand.nextInt(30));
		System.out.println(intset);
	}
}