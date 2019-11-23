package multipleThread_3;

//Multiple Thread - Thread Safe using AtomicInteger Type
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	AtomicInteger count = new AtomicInteger();

	public AtomicInteger getCount() {
		return count;
	}

	public void increment() {
		count.incrementAndGet();
	}
}