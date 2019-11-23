package singleThread;

public class Test {

	public static void main(String[] args) {

		Counter c1 = new Counter();

		for (int i = 0; i < 2000; i++) {
			c1.increment();
		}

		System.out.println(c1.getCount());

	}

}