import java.io.*;

public class MyFileInputStream{

	public static void main(String[] args){
	
		try{
			RandomAccessFile fr = new RandomAccessFile("input.txt");
			int c;

			while(       (c=fr.read()) != -1 ){
				System.out.println(  (char)c  );
			}
			fr.close();
		}
		catch(Exception e){System.out.println(e);
		}
	}
}