import java.*;
import java.io.*;

class MyException extends Exception{
	MyException(String s){
	super(s);
	}
}


class AllException{	
	static void checkError( int x ) throws Exception{
		if(x > 0){
			throw new  MyException("not valid number");
		}
	}

	public static void main(String args[]) {
		try{
		checkError(5);
		}
		catch(Exception e){
			System.out.println(e);
		}			
	}
}

// make own exception class