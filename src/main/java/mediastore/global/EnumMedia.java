package mediastore.global;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum EnumMedia {

	ALBUMS("Albums","Music",false,EnumMediaLogoImage.ALBUMS,"images/albuns"),
	APPLICATIONS("Applications","Software",false,EnumMediaLogoImage.APPLICATIONS,"images/apps"),
	COLLECTIONSTIOPATINHASNORMAL("Tio Patinhas","Collections",true,EnumMediaLogoImage.COLLECTIONSTIOPATINHASNORMAL,"images/collections/tp"),
	COLLECTIONSTIOPATINHASSHOWDISNEY("Show Disney","Collections",true,EnumMediaLogoImage.COLLECTIONSTIOPATINHASSHOWDISNEY,"images/collections/sd"),
	COLLECTIONSMATUTAZOS("Matutazos","Collections",false,EnumMediaLogoImage.COLLECTIONSMATUTAZOS,"images/collections/tazos"),
	EBOOKS("EBooks","EBooks",true,EnumMediaLogoImage.EBOOKS,"images/docs"),
	GAMESPC("Games PC", "Games",true,EnumMediaLogoImage.GAMESPC,"images/games/pc"),
	GAMESDOS("Games DOS", "Games",false,EnumMediaLogoImage.GAMESDOS,"images/games/dos"),
	MOVIESCINEMA("Movies Cinema", "Movies",true,EnumMediaLogoImage.MOVIESCINEMA,"images/movies/cine"),
	MOVIESCARTOONS("Movies Cartoons", "Movies",true,EnumMediaLogoImage.MOVIESCARTOONS,"images/movies/cartoons"),
	ROMSGAMEBOY("Game Boy", "Roms",false,EnumMediaLogoImage.ROMSGAMEBOY,"images/roms/gameboy"),
	ROMSGAMEBOYCOLOR("Game Boy Color", "Roms",false,EnumMediaLogoImage.ROMSGAMEBOYCOLOR,"images/roms/gameboycolor"),
	ROMSGAMEGEAR("Game Gear", "Roms",true,EnumMediaLogoImage.ROMSGAMEGEAR,"images/roms/gamegear"),
	ROMSMEGADRIVE("Mega Drive", "Roms",true,EnumMediaLogoImage.ROMSMEGADRIVE,"images/roms/megadrive"),
	ROMSSEGASATURN("Sega Saturn", "Roms",true,EnumMediaLogoImage.ROMSSEGASATURN,"images/roms/segasaturn"),
	ROMSNES("Nintendo", "Roms",true,EnumMediaLogoImage.ROMSNES,"images/roms/nes"),
	ROMSSNES("Super Nintendo", "Roms",false,EnumMediaLogoImage.ROMSSNES,"images/roms/snes"),
	ROMSN64("Nintendo 64", "Roms",true,EnumMediaLogoImage.ROMSN64,"images/roms/n64"),
	SERIESTV("Series TV", "Series",true,EnumMediaLogoImage.SERIESTV,"images/series/tvseries"),
	SERIESCARTOONS("Series Cartoons", "Series",true,EnumMediaLogoImage.SERIESCARTOONS,"images/series/cartoons");

	EnumMedia(String label, String category, Boolean coverRectangular, EnumMediaLogoImage logoPath, String imagesPath){
		this.label = label;
		this.category = category;
		this.coverRectangular = coverRectangular;
		this.logoPath = logoPath;
		this.imagesPath = imagesPath;
	}
	
	private String label;
	private String category;
	private Boolean coverRectangular;
	private EnumMediaLogoImage logoPath;
	private String imagesPath;

	
	public String getLabel() {
		return label;
	}
	
	public String getCategory() {
		return category;
	}
	
	public Boolean getCoverRectangular() {
		return coverRectangular;
	}
	
	public EnumMediaLogoImage getLogoPath() {
		return logoPath;
	}

	public static synchronized List<EnumMedia> getValuesFilteredByType(EnumMedia enumType) {
		return Arrays.asList(EnumMedia.values()).stream()
				.filter(enumMedia -> enumMedia.getCategory().equals(enumType.getCategory()))
				.collect(Collectors.toList());
	}

	public String getImagesPath() {
		return imagesPath;
	}
	
	
}