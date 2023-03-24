package lib2;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread1");
	}
}

public class LambdaDemo {
	public static void print() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {

		var t1 = new Thread(new Task());
		t1.start();

		var t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread2");
			}
		});

		t2.start();

		// Lambda Expression
		var t3 = new Thread(() -> System.out.println("Thread3"));
		t3.start();

		// Lambda Block
		var t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});
		t4.start();

		// Method reference 
		var t5 = new Thread(LambdaDemo::print);
		t5.start();

	}

}
