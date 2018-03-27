package se.dowhile.extendedexceptions;

/**
 * Provides checks for, and access to, additional data for the exception
 */
public interface ExtendedException {

	/**
	 * Checks if this exception has non-null additional data
	 * @return true if additional data available
	 */
	public boolean hasAdditionalData();
	
	/**
	 * Additional information and data about the exceptions, such as identity, URL etc.
	 * <br>
	 * If no additional data has been given, returns <code>null</code>
	 * <br><br>
	 * You may call {@link #hasAdditionalData()} to check whether calling this method would return in a null value.
	 * @return additional data, if available
	 */
	public AdditionalData getAdditionalData();
}
