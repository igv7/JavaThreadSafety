package multipleThread_3;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Counter c1 = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c1.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c1.increment();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(c1.getCount());

	}

}