package mediastore.global;

public enum HumanState {

	DONE("Done"),
	PROGRESSING("Processing"),
	YETNOIMAGE("No Image");
	
	private String label;
	
	HumanState(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	
}
