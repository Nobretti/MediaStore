package mediastore.database.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import mediastore.global.Country;
import mediastore.global.EnumMedia;
import mediastore.global.HumanState;

@MappedSuperclass
public abstract class MediaStore{

	protected String description;

	@Enumerated(EnumType.STRING)
	protected HumanState humanstate;

	protected String imgpath;

	protected String link;

	protected int rate;

	protected String releaseYear;

	protected String shortname;
	
	@Enumerated(EnumType.STRING)
	protected EnumMedia mediatype;
	
	@Enumerated(EnumType.STRING)
	protected Country country;

	public abstract Integer getId();
	
	public abstract void setId(Integer id);

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HumanState getHumanstate() {
		return humanstate;
	}

	public void setHumanstate(HumanState humanstate) {
		this.humanstate = humanstate;
	}

	public String getImgpath() {
		return imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public EnumMedia getMediatype() {
		return mediatype;
	}

	public void setMediatype(EnumMedia mediatype) {
		this.mediatype = mediatype;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


	
}
