package src.ts.exceptions;
public class EmptyFileNameException extends Exception{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public EmptyFileNameException(String s) {
	/*	System.out.println("\nEmptyFileName Exception");
		System.out.println("Information cannot be saved");*/
		super(s);
	}
}

