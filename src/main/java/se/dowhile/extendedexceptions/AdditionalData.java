package se.dowhile.extendedexceptions;

import javax.annotation.Generated;

/**
 * Carries additional data for an exception
 */
public class AdditionalData {

	/**
	 * Identity used until an issue has been identified
	 */
	static final String NOT_IDENTIFIED = "NOT_IDENTIFIED";

	private final String identity;
	private final String issueCategory;
	private final String issueDomain;
	private final Object attachedObject;
	private final String informationUrl;

	@Generated("SparkTools")
	private AdditionalData(Builder builder) {
		this.identity = builder.identity;
		this.issueCategory = builder.issueCategory;
		this.issueDomain = builder.issueDomain;
		this.attachedObject = builder.attachedObject;
		this.informationUrl = builder.informationUrl;
	}

	/**
	 * Creates builder to build {@link AdditionalData}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Identity that uniquely identifies this issue <br>
	 * Returns the identity given to the specific issue represented by the
	 * exception being extended. <br>
	 * If no identity has been set, <code>NOT_IDENTIFIED</code> will be
	 * returned. <br>
	 * You may call {@link #hasIdentity()} to see if an identity has been
	 * provided.
	 * 
	 * @return Given identity, of <code>NOT_IDENTIFIED</code>
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * Returns true if an identity has been given to this object. <br>
	 * Equivalent to calling
	 * <code>getIdentity().equals("NOT_IDENTIFIED") == false</code>
	 * 
	 * @return true if identity has been provided
	 */
	public boolean hasIdentity() {
		return !NOT_IDENTIFIED.equals(identity);
	}

	/**
	 * More specific category this issue belongs to <br>
	 * Returns issue category if set during build, otherwise value set via
	 * {@link ExtendedExceptions#overrideDefaultCategory(String)} if set,
	 * otherwise <code>CATEGORY_NOT_SPECIFIED</code>
	 * 
	 * @return issue category
	 */
	public String getIssueCategory() {
		return issueCategory;
	}

	/**
	 * High-level domain (e.g. "programming error" or "environment") that is the
	 * likely cause of this issue <br>
	 * Returns issue domain if set during build, otherwise value set via
	 * {@link ExtendedExceptions#overrideDefaultDomain(String)} if set,
	 * otherwise <code>DOMAIN_NOT_SPECIFIED</code>
	 * 
	 * @return issue domain
	 */
	public String getIssueDomain() {
		return issueDomain;
	}

	/**
	 * Object attached to the issue that might be used for further
	 * troubleshooting or identification <br>
	 * Returns the object attached, if any was provided during build, otherwise
	 * <code>null</code> <br>
	 * You may call {@link #hasAttachedObject()} before to check for a non-null
	 * value
	 * 
	 * @return attached object
	 */
	public Object getAttachedObject() {
		return attachedObject;
	}

	/**
	 * Returns true if {@link #getAttachedObject()} has a value other than
	 * <code>null</code>
	 * 
	 * @return true if attached object set
	 */
	public boolean hasAttachedObject() {
		return attachedObject != null;
	}

	/**
	 * URL indicating where people can find more information about the issue
	 * that has occurred or how to troubleshoot it <br>
	 * Returns the URL set during build. If no URL was set, the value provided
	 * to {@link ExtendedExceptions#overrideDefaultInformationUrl(String)} will
	 * be returned. If no value was provided there either,
	 * <code>DEFAULT_INFORMATION_URL</code> is returned.
	 * 
	 * @return information url
	 */
	public String getInformationUrl() {
		return informationUrl;
	}

	/**
	 * Returns true if {@link #getInformationUrl()} has any value other than
	 * <code>DEFAULT_INFORMATION_URL</code>, which would happen if the value is
	 * set during the build or via
	 * {@link ExtendedExceptions#overrideDefaultInformationUrl(String)}
	 * 
	 * @return true if URL not <code>DEFAULT_INFORMATION_URL</code>
	 */
	public boolean hasInformationUrl() {
		boolean defaultUrlChanged = AdditionalDataDefaults.hasNonInitialInformationUrl();
		boolean urlSetDuringBuild = AdditionalDataDefaults.getDefaultInformationUrl().equals(informationUrl) == false;
		return defaultUrlChanged || urlSetDuringBuild;

	}

	/**
	 * Builder to build {@link AdditionalData}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String identity = NOT_IDENTIFIED;
		private String issueCategory = AdditionalDataDefaults.getDefaultIssueCategory();
		private String issueDomain = AdditionalDataDefaults.getDefaultIssueDomain();
		private Object attachedObject;
		private String informationUrl = AdditionalDataDefaults.getDefaultInformationUrl();

		private Builder() {
		}

		/**
		 * Sets issue identity
		 * @param identity issue identity
		 * @return builder
		 */
		public Builder withIdentity(String identity) {
			this.identity = identity;
			return this;
		}

		/**
		 * Sets issue category
		 * @param issueCategory issue category
		 * @return builder
		 */
		public Builder withIssueCategory(String issueCategory) {
			this.issueCategory = issueCategory;
			return this;
		}

		/**
		 * Sets issue domain
		 * @param issueDomain issue domain
		 * @return builder
		 */
		public Builder withIssueDomain(String issueDomain) {
			this.issueDomain = issueDomain;
			return this;
		}

		/**
		 * Sets object attached to issue
		 * @param attachedObject object to attach
		 * @return builder
		 */
		public Builder withAttachedObject(Object attachedObject) {
			this.attachedObject = attachedObject;
			return this;
		}

		/**
		 * Sets information URL for issue
		 * @param informationUrl issue information url
		 * @return builder
		 */
		public Builder withInformationUrl(String informationUrl) {
			this.informationUrl = informationUrl;
			return this;
		}

		/**
		 * Builds the additional data for the issue
		 * @return {@link AdditionalData}
		 */
		public AdditionalData build() {
			return new AdditionalData(this);
		}
	}

}
