package mediastore.database.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the APPLICATIONS database table.
 * 
 */
@Entity
@Table(name="APPLICATIONS")

public class Application extends MediaStore implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apps_generator")
	@SequenceGenerator(name="apps_generator", sequenceName = "applications_seq", allocationSize=50)
	protected int id;
	
	private String company;

	private String os;
	
	private String utility;

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getUtility() {
		return this.utility;
	}

	public void setUtility(String utility) {
		this.utility = utility;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}