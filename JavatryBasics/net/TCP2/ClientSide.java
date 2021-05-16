import java.io.*;  
import java.net.*; 
import java.util.*;
 
public class ClientSide {  
	public static void main(String[] args) {  
	try{      
		//same process both side coz data pathauna output lina lai input.
		Socket s=new Socket("localhost",6666);  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		
		//scanner chae user bata input magna tmle cin vane jasto c++ harma
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers.");
		
		//next int chae user bata duita int lera a ra b maa halna
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//input gareko number a ra b maa pasyo aaba yo step maa server lai deko
		dout.writeInt(a);
		dout.writeInt(b);  
		dout.flush();  

		//duita num pathaisakim aaba server lee deko result magera c maa rakheko
		int c = dis.readInt();
		System.out.println("value received from server is:" + c );

		dout.close();  
		s.close();  
	}catch(Exception e){System.out.println(e);}  
	}  
}  