package mediastore.global;

public enum Country {

	JP("Japan"),
	EUR("Europe"),
	PT("Portugal"),
	US("American");
	
	private String label;
	
	Country(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	
}
