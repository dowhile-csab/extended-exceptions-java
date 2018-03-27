package se.dowhile.extendedexceptions.jdkexceptions;

import se.dowhile.extendedexceptions.AdditionalData;
import se.dowhile.extendedexceptions.ExtendedException;

/**
 * Extended variant of {@link RuntimeException}
 */
public class ExtendedRuntimeException extends RuntimeException implements ExtendedException {
	private AdditionalData additionalData;

	/**
	 * Constructs an exception carrying a message describing the issue
	 * 
	 * @param message
	 *            Issue message
	 */
	public ExtendedRuntimeException(String message) {
		super(message);
	}

	/**
	 * Constructs an exception carrying a message describing the issue, and an
	 * additional exception that was the cause of this issue
	 * 
	 * @param message
	 *            Issue message
	 * @param cause
	 *            Cause of issue
	 */
	public ExtendedRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs an exception carrying a message describing the issue and an
	 * {@link AdditionalData} object providing extended information about this issue
	 * <br>
	 * Call {@link AdditionalData#builder()} to build a new AdditionalData object.
	 * 
	 * @param message
	 *            Issue message
	 * @param additionalData
	 *            extended data for the issue
	 */
	public ExtendedRuntimeException(String message, AdditionalData additionalData) {
		this(message);
		this.additionalData = additionalData;
	}

	/**
	 * Constructs an exception carrying a message describing the issue, an exception
	 * that was the cause of this issue, and an {@link AdditionalData} object
	 * providing extended information about this issue <br>
	 * Call {@link AdditionalData#builder()} to build a new AdditionalData object.
	 * 
	 * @param message
	 *            Issue message
	 * @param cause
	 *            Cause of issue
	 * @param additionalData
	 *            extended data for the issue
	 */
	public ExtendedRuntimeException(String message, Throwable cause, AdditionalData additionalData) {
		this(message, cause);
		this.additionalData = additionalData;
	}

	@Override
	public boolean hasAdditionalData() {
		return null != additionalData;
	}

	@Override
	public AdditionalData getAdditionalData() {
		return additionalData;
	}

}
