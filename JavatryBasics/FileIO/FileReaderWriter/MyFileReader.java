import java.io.*;

public class MyFileReader{

	public static void main(String[] args){
	
		try{
			FileReader fr = new FileReader("output.txt");
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