class OwnException extends Exception{
	OwnException(String s){
	super(s);
	}
}

class Example{

static void check(int x) throws OwnException{
	if(x<0){
	throw new OwnException("invalid");
		}
	}

public static void main(String[] args){
	
	try{
	check(2);
	}catch(Exception e){
		System.out.println(e);
	}

	}

}