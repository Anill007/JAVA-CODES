import java.io.*;

public class MyFileOutputStream{

	public static void main(String[] args){
	
		try{
			FileOutputStream fos = new FileOutputStream("input.txt");
			String s = "successful...............";
			byte[] data = s.getBytes();
			fos.write(data);
			fos.close();
		}
		catch(Exception e){System.out.println(e);
		}
	}
}