

public class RunnableThread implements Runnable{

	public void run() {
		try{
		System.out.println("running child thread.");
		}catch(Exception e){
			System.out.println(e);}
	}

	public static void main(String[] args) throws Exception{
		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);
		t.start();
	}
}

// Thread made implementing runnable interface