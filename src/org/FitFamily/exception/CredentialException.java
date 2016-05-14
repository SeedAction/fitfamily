package org.FitFamily.exception;

public class CredentialException extends RuntimeException {
	
	
	private static final long serialVersionUID = -6717756986647753869L;

	public CredentialException() {
		super();
	}

	public CredentialException(String message, Throwable cause) {
		super(message, cause);
	}

	public CredentialException(String message) {
		super(message);
	}

	public CredentialException(Throwable cause) {
		super(cause);
	}
}