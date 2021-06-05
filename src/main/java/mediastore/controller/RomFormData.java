package mediastore.controller;

public class RomFormData {

	private Integer mediaSelectedId;
	private String mediaSelectedCompany;
	private String mediaSelectedDeveloper;
	private String mediaSelectedYear;
	private Integer mediaSelectedRate;
	private String mediaSelectedCountry;
	private String mediaSelectedDescription;
	private String mediaSelectedMoreInfo;

	public RomFormData() {}
	

	public RomFormData(Integer mediaSelectedId, String mediaSelectedCompany, String mediaSelectedDeveloper,
			String mediaSelectedYear, Integer mediaSelectedRate, String mediaSelectedCountry,
			String mediaSelectedDescription, String mediaSelectedMoreInfo) {
		super();
		this.mediaSelectedId = mediaSelectedId;
		this.mediaSelectedCompany = mediaSelectedCompany;
		this.mediaSelectedDeveloper = mediaSelectedDeveloper;
		this.mediaSelectedYear = mediaSelectedYear;
		this.mediaSelectedRate = mediaSelectedRate;
		this.mediaSelectedCountry = mediaSelectedCountry;
		this.mediaSelectedDescription = mediaSelectedDescription;
		this.mediaSelectedMoreInfo = mediaSelectedMoreInfo;
	}

	public String getMediaSelectedCompany() {
		return mediaSelectedCompany;
	}

	public void setMediaSelectedCompany(String mediaSelectedCompany) {
		this.mediaSelectedCompany = mediaSelectedCompany;
	}


	public Integer getMediaSelectedId() {
		return mediaSelectedId;
	}


	public void setMediaSelectedId(Integer mediaSelectedId) {
		this.mediaSelectedId = mediaSelectedId;
	}


	public String getMediaSelectedDeveloper() {
		return mediaSelectedDeveloper;
	}


	public void setMediaSelectedDeveloper(String mediaSelectedDeveloper) {
		this.mediaSelectedDeveloper = mediaSelectedDeveloper;
	}


	public String getMediaSelectedYear() {
		return mediaSelectedYear;
	}


	public void setMediaSelectedYear(String mediaSelectedYear) {
		this.mediaSelectedYear = mediaSelectedYear;
	}


	public Integer getMediaSelectedRate() {
		return mediaSelectedRate;
	}


	public void setMediaSelectedRate(Integer mediaSelectedRate) {
		this.mediaSelectedRate = mediaSelectedRate;
	}


	public String getMediaSelectedCountry() {
		return mediaSelectedCountry;
	}


	public void setMediaSelectedCountry(String mediaSelectedCountry) {
		this.mediaSelectedCountry = mediaSelectedCountry;
	}


	public String getMediaSelectedDescription() {
		return mediaSelectedDescription;
	}


	public void setMediaSelectedDescription(String mediaSelectedDescription) {
		this.mediaSelectedDescription = mediaSelectedDescription;
	}


	public String getMediaSelectedMoreInfo() {
		return mediaSelectedMoreInfo;
	}


	public void setMediaSelectedMoreInfo(String mediaSelectedMoreInfo) {
		this.mediaSelectedMoreInfo = mediaSelectedMoreInfo;
	}
	
	
	
}