package se.dowhile.extendedexceptions;

/**
 * Access and configuration for the extended exceptions library
 */
public class ExtendedExceptions {
	
	/**
	 * Provides a value that will be returned by {@link AdditionalData#getIssueDomain()} whenever no domain is specified
	 * @param newDefaultDomain New default value for issue domain
	 */
	public void overrideDefaultDomain(String newDefaultDomain) {
		AdditionalDataDefaults.setDefaultIssueDomain(newDefaultDomain);
	}
	
	/**
	 * Provides a value that will be returned by {@link AdditionalData#getIssueCategory()} whenever no category is specified
	 * @param newDefaultIssue New default value for issue category
	 */
	public void overrideDefaultCategory(String newDefaultCategory) {
		AdditionalDataDefaults.setDefaultIssueCategory(newDefaultCategory);
	}
	
	/**
	 * Provides a value that will be returned by {@link AdditionalData#getInformationUrl()} whenever no info URL is specified
	 * <br>
	 * Note that setting a value other than <code>DEFAULT_INFORMATION_URL</code> will cause AdditionalData#
	 * @param newDefaultInformationUrl New default value for info URL
	 */
	public void overrideDefaultInformationUrl(String newDefaultInformationUrl) {
		AdditionalDataDefaults.setDefaultInformationUrl(newDefaultInformationUrl);
	}
}
