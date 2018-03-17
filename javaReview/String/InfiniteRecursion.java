import java.util.*;

public class InfiniteRecursion {
	public String toString() {
		return "Infiniterecursion address: " + super.toString() + "\n";
	}

	public static void main(String[] args) {
		try {
			List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
			for(int i =0; i < 10; i++)
			v.add(new InfiniteRecursion());
			System.out.println(v);
		} catch(Exception e) {
			System.out.println("error");
		}
	}
}