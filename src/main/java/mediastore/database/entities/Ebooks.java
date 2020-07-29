package mediastore.database.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EBOOKS database table.
 * 
 */
@Entity
@Table(name="EBOOKS")
public class Ebooks extends MediaStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ebooks_generator")
	@SequenceGenerator(name="ebooks_generator", sequenceName = "ebooks_seq", allocationSize=50)
	protected int id;
	
	private String author;
	
	private String textformat;

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTextformat() {
		return this.textformat;
	}

	public void setTextformat(String textformat) {
		this.textformat = textformat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}