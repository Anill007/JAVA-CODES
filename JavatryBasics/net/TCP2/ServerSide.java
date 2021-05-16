import java.io.*;  
import java.net.*; 
import java.util.*;
import java.*;  
 
public class ServerSide {  
	public static void main(String[] args) throws Exception{  
		ServerSocket ss=new ServerSocket(6666);  
	
	
		Socket s=ss.accept();   
			
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		
		//yo chae client bata aako read gareko
		//simple cha int pathayo vane read int garne 
		// hamro paila ko eg ma read utf gareko string read garna
		// float vako vaye read float huntheo same for client
		int a=dis.readInt();
		int b = dis.readInt();  
		int c = a+b;
		
		//dout bata server lee client lai c ko value pathaideo flush garda gayo client ko ma.
		dout.writeInt(c);
		dout.flush();
		

		s.close();
		ss.close();

	}  
}  