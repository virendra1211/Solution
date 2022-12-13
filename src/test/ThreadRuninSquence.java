package test;

public class ThreadRuninSquence {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->
		{System.out.println("A");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}});
		Thread t2 = new Thread(()->
		{System.out.println("B");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}});
		
		Thread t3 = new Thread(()->
		{System.out.println("C");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}});
		
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}

}
