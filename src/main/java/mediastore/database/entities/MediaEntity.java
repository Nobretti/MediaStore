package mediastore.database.entities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import mediastore.global.Country;
import mediastore.global.EnumMedia;
import mediastore.global.HumanState;

@MappedSuperclass
public abstract class MediaEntity{

	protected String description;

	@Enumerated(EnumType.STRING)
	protected HumanState humanstate;

	protected String imgpath;

	protected String link;

	protected int rate;

	protected int releaseyear;

	protected String shortname;
	
	@Enumerated(EnumType.STRING)
	protected EnumMedia mediatype;
	
	@Enumerated(EnumType.STRING)
	protected Country country;

	public abstract int getId();
	
	public abstract void setId(int id);

	public int getRate() {
		return this.rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getReleaseyear() {
		return this.releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public String getShortname() {
		return this.shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HumanState getHumanstate() {
		return this.humanstate;
	}

	public void setHumanstate(HumanState humanstate) {
		this.humanstate = humanstate;
	}

	public String getImgpath() {
		return this.imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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
