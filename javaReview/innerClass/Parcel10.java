public class Parcel10 {
	public Contents contents =
		new Contents() {
			private int i = 11;
			public int value() { return i; }
		};
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Contents c = p.contents;
		System.out.println(c.value());
	}
}

