import java.io.*;  
import java.net.*; 
import java.util.*;
 
public class ClientSide {  
	public static void main(String[] args) {  
	try{      
		Socket s=new Socket("localhost",6666);  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers.");
		
		int a = scan.nextInt();
		
		dout.writeInt(a);
		dout.flush();  

		int c = dis.readInt();
		System.out.println("Area is:" + c );

		dout.close();  
		s.close();  
	}catch(Exception e){System.out.println(e);}  
	}  
}  