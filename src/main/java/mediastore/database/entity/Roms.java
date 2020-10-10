package mediastore.database.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the ROMS database table.
 * 
 */
@Entity
@Table(name="ROMS")
public class Roms extends MediaStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roms_generator")
	@SequenceGenerator(name="roms_generator", sequenceName = "roms_seq", allocationSize=1)
	protected int id;
	
	private String company;

	private String romtype;

	private String console;
	
	public Roms() {
	}
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public String getRomtype() {
		return this.romtype;
	}

	public void setRomtype(String romtype) {
		this.romtype = romtype;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}