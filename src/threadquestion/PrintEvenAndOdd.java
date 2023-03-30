package threadquestion;

public class PrintEvenAndOdd {

	public static void main(String[] args) {
		PE pe = new PE();

		Thread t1 = new Thread(() -> pe.printEven());
		Thread t2 = new Thread(() -> pe.printOdd());
		t1.start();
		t2.start();

	}

	static class PE {
		int counter = 1;
		int N = 20;
		public void printEven() {
			synchronized (this)
			{
				while (counter < N) {
					while (counter % 2 == 1) {
						try {
							wait();
						}
						catch (
							InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.print(counter + " ");
					counter++;
					notify();
				}
			}
		}

		public void printOdd() {
			synchronized (this) {
				while (counter < N) {
					while (counter % 2 == 0) {
						try {
							wait();
						} catch (InterruptedException e) {
						}
					}
				System.out.print(counter+" ");
				counter++;
				notify();
				}
				}
		}
	}
}
