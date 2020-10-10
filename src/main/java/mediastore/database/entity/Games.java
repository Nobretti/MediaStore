package mediastore.database.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * The persistent class for the GAMES database table.
 * 
 */
@Entity
public class Games extends MediaStore implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	
	private String company;
	private String os;
	private String type;
	

	public Games() {
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public Integer getId() {
		return id;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	

}