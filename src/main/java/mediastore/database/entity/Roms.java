package mediastore.database.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the ROMS database table.
 * 
 */
@Entity
@Table(name="Roms")
public class Roms extends MediaStore implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String company;

	private String developer;
	
	public Roms() {
	}
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
}