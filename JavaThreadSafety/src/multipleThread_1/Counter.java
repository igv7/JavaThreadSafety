package multipleThread_1;

//Multiple Thread - Not Thread Safe
public class Counter {

	private int count;

	public int getCount() {
		return count;
	}

	public void increment() {
		count++;
	}
}