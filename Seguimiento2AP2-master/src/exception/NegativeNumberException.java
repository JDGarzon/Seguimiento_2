package exception;


public class NegativeNumberException extends Exception{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeNumberException( Throwable cause) {
		super(cause);
	}
	
	@Override
	public String getMessage() {
		return "No se pueden ingresar valores negativos";
	}
	

}
