class Std{
	public static String name="abc";
	public int roll;
	public Std(int roll){
		this.roll = roll;
	}

	 public static void change(){  
     		name = "qqqq"; 
		//roll = 5;      not a static variable 
     	}  	
}

public class MyTry{
	public static void main(String[] args){
		Std s1 = new Std(1);
		Std s2 = new Std(2);
		
		Std.name="anil";
		s1.change();
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1.roll);
		System.out.println(s2.roll);
		


	}
}