package se.dowhile.extendedexceptions;

class AdditionalDataDefaults {
	private static String defaultIssueDomain = "DOMAIN_NOT_SPECIFIED";
	private static String defaultIssueCategory = "CATEGORY_NOT_SPECIFIED";
	private static String INITIAL_INFORMAION_URL = "DEFAULT_INFORMATION_URL";
	private static String defaultInformationUrl = INITIAL_INFORMAION_URL;

	static String getDefaultIssueDomain() {
		return defaultIssueDomain;
	}

	static void setDefaultIssueDomain(String defaultIssueDomain) {
		AdditionalDataDefaults.defaultIssueDomain = defaultIssueDomain;
	}

	static String getDefaultIssueCategory() {
		return defaultIssueCategory;
	}

	static void setDefaultIssueCategory(String defaultIssueCategory) {
		AdditionalDataDefaults.defaultIssueCategory = defaultIssueCategory;
	}

	static String getDefaultInformationUrl() {
		return defaultInformationUrl;
	}

	static void setDefaultInformationUrl(String defaultInformationUrl) {
		AdditionalDataDefaults.defaultInformationUrl = defaultInformationUrl;
	}
	
	static boolean hasNonInitialInformationUrl() {
		return !INITIAL_INFORMAION_URL.equals(defaultInformationUrl);
	}
}
