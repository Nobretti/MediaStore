package mediastore.database.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the COLLECTIONS database table.
 * 
 */
@Entity
@Table(name="COLLECTIONS")
public class Collections extends MediaStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "collections_generator")
	@SequenceGenerator(name="collections_generator", sequenceName = "collections_seq", allocationSize=1)
	protected int id;
	
	private String company;

	private int numberCollection;

	private String type;

	public Collections() {
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getNumberCollection() {
		return numberCollection;
	}

	public void setNumberCollection(int numberCollection) {
		this.numberCollection = numberCollection;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}