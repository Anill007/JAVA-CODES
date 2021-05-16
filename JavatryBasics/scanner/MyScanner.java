import java.util.*;  
import java.io.*;

public class MyScanner{

	public static void main(String[] args) throws Exception{
	
		
		
		DataInputStream input = new DataInputStream(System.in);

		int    w  = input.read();
		int    x   = input.readInt();
		float  y  = input.readFloat();
		double z = input.readDouble();
		
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}



}