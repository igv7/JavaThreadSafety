package multipleThread_2;

//Multiple Thread - Thread Safe using synchronized keyword
public class Counter {

	private int count;

	public int getCount() {
		return count;
	}

	public synchronized void increment() {
		count++;
	}
}