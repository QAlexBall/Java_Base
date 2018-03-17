public class Holder2 {
	private Object a;
	public Holder2(Object a) {
		this.a = a;
	}
	public void set(Object a) {
		this.a = a;
	}
	public Object get() {
		return a;
	}
	public static void main(String[] arggs) {
		Holder2 h2 = new Holder(new Automobile());
		Automobile a = (Automobile)h2.get();
		
	}
}