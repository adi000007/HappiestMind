package in.techgig.dictionary.advice;


public class MyCustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
		
	public MyCustomException(String message) {
		super(message);
	}
	
}
