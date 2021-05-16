import java.io.*;


class MyCheck{

	public static void main(String args[]) throws IOException{
	
	RandomAccessFile fr = new RandomAccessFile("input.txt", "r");
	RandomAccessFile fw = new RandomAccessFile("output.txt", "rw");
	int c;

	while(  ( c = fr.read()   ) !=  -1   ){
		System.out.println((char)c);
		fw.write(c);		
	}
	fw.close();

}


}