public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
	public final C third;
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		third = c;
	}
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}

	public static void main(String[] args) {
		ThreeTuple<Integer, String, Integer> tt = new ThreeTuple<Integer, String, Integer>(1, "hello", 2);
		System.out.println(tt);
	}
}