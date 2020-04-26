package mediastore.database.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the SERIES database table.
 * 
 */
@Entity
@Table(name="SERIES")
@NamedQueries({
	@NamedQuery(name="SeriesEntity.findAllSeriesTv", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESTV order by s.shortname"),
	@NamedQuery(name="SeriesEntity.findAllSeriesTvByRate", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESTV order by s.rate"),
	@NamedQuery(name="SeriesEntity.findAllSeriesTvByState", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESTV order by s.humanstate"),
	@NamedQuery(name="SeriesEntity.findAllSeriesTvByYear", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESTV order by s.releaseyear"),
	@NamedQuery(name="SeriesEntity.findAllSeriesCartoons", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESCARTOONS order by s.shortname"),
	@NamedQuery(name="SeriesEntity.findAllSeriesCartoonsByRate", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESCARTOONS order by s.rate"),
	@NamedQuery(name="SeriesEntity.findAllSeriesCartoonsByState", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESCARTOONS order by s.humanstate"),
	@NamedQuery(name="SeriesEntity.findAllSeriesCartoonsByYear", query="SELECT s FROM SeriesEntity s where s.mediatype = mediaee.global.EnumMedia.SERIESCARTOONS order by s.releaseyear"),
}) 
public class SeriesEntity extends MediaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "series_generator")
	@SequenceGenerator(name="series_generator", sequenceName = "series_seq", allocationSize=50)
	protected int id;
	
	private String company;

	private int endyear;

	private String producer;

	private int seasons;

	public SeriesEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEndyear() {
		return this.endyear;
	}

	public void setEndyear(int endyear) {
		this.endyear = endyear;
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

	public String getProducer() {
		return this.producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

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

	public int getSeasons() {
		return this.seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public String getShortname() {
		return this.shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

}