class A{
	public int a = 5;
	public void run(){ System.out.println("run");};
}

class Upcast extends A{
	public int b = 3;
	public void run(){ System.out.println("running");};

	public static void main(String args[]){
	A aa = new Upcast();
	aa.run();
	 System.out.println(aa.a);
	// System.out.println(aa.b);
	}
}
