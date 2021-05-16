import java.io.*;  
import java.net.*; 
import java.util.*;  
 
public class ServerSide {  
	public static void main(String[] args){  
	try{  
		ServerSocket ss=new ServerSocket(6666);  
		Socket s=ss.accept();   
		
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		
		int a=dis.readInt();
		int c = 3.14*a*a;
		
		dout.writeInt(c);
		dout.flush();
		
		dout.close();
		ss.close();  
	}catch(Exception e){
		System.out.println(e);
		}  
	}  
}  

//server side to receive radius and return area to user