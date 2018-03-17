
interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {
	private int i = 0;
	public void increment() {
		i++;
		System.out.println(i);
	}
}

class MyIncrement {
	public void increment()  {
		System.out.println("Other iperation"); 
	}
	static void f(MyIncrement mi) { mi.increment(); }
}

