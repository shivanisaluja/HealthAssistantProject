package src.ts.exceptions;
public class MissingExtensionException extends Exception{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public MissingExtensionException(String s) {
		super(s);
		/*System.out.println("\nMissingExtension Exception");
		System.out.println("Information cannot be saved");*/
	}
}

