package code.ds.exception;

public class QueueFullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6728066558158585146L;

	public QueueFullException(String message) {
		super(message);
	}

	public QueueFullException(Throwable cause) {
		super(cause);
	}

	public QueueFullException(String message, Throwable cause) {
		super(message, cause);
	}

	public QueueFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
