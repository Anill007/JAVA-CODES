

public class MyThread extends Thread{

	public void run() {
		try{
		System.out.println("running child thread.");
		}catch(Exception e){
			System.out.println(e);}
	}

	public static void main(String[] args) throws Exception{
		MyThread t1 = new MyThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
	}
}

// Multiple thread with priorities