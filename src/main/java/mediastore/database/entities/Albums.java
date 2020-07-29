package mediastore.database.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ALBUMS database table.
 * 
 */
@Entity
@Table(name="ALBUMS")

public class Albums extends MediaStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "albums_generator")
	@SequenceGenerator(name="albums_generator", sequenceName = "albums_seq", allocationSize=50)
	protected int id;
	
	private int nrtracks;
	
	private String artist;

	private String company;

	private String time;

	public Albums() {
	}
	
	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public int getNrtracks() {
		return this.nrtracks;
	}

	public void setNrtracks(int nrtracks) {
		this.nrtracks = nrtracks;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}