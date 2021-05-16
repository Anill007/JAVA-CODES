import java.io.*;

public class MyFileWriter{

	public static void main(String[] args){
	
		try{
			FileWriter fw = new FileWriter("input.txt");

			fw.write("This is a simple test. \n");
			fw.write("-by abcd.");

			fw.flush();
			fw.close();
		}
		catch(Exception e){System.out.println(e);
		}
	}
}