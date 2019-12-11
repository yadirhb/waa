package edu.mum.exception;

public class EmployeeImagenException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeImagenException(Throwable t) {
		super("Unable to upload the image", t);
	}

}
