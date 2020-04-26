package mediastore.global;

public enum EnumMediaLogoImage {

	ALBUMS("resources/images/icons/albums.png",250,30),
	APPLICATIONS("resources/images/icons/ebooks.png",250,30),
	COLLECTIONSTIOPATINHASNORMAL("resources/images/icons/tioPatinhasLogo.jpg",250,50),
	COLLECTIONSTIOPATINHASSHOWDISNEY("resources/images/icons/showDisneyLogo.jpg",180,60),
	COLLECTIONSMATUTAZOS("resources/images/icons/albums.png",250,30),
	EBOOKS("resources/images/icons/ebooks.png",250,30),
	GAMESPC("resources/images/icons/gamesPcLogo.png",200,30),
	GAMESDOS("resources/images/icons/gamesDosLogo.png",250,30),
	MOVIESCINEMA("resources/images/icons/moviesCinemaLogo.png",250,30),
	MOVIESCARTOONS("resources/images/icons/moviesCinemaLogo.png",250,30),
	ROMSGAMEBOY("resources/images/icons/gameBoyLogo.png",200,30),
	ROMSGAMEBOYCOLOR("resources/images/icons/gameBoyColorLogo.png",300,30),
	ROMSGAMEGEAR("resources/images/icons/gameGearLogo.png",200,40),
	ROMSMEGADRIVE("resources/images/icons/megaDriveLogo.png",250,40),
	ROMSSEGASATURN("resources/images/icons/segaSaturnLogo.png",250,40),
	ROMSNES("resources/images/icons/nesLogo.png",250,40),
	ROMSSNES("resources/images/icons/snesLogo.png",250,30),
	ROMSN64("resources/images/icons/n64Logo.png",150,90),
	SERIESTV("resources/images/icons/series.png",250,30),
	SERIESCARTOONS("resources/images/icons/series.png",250,30);
	
	private String imgPath;
	private int width;
	private int height;
	
	EnumMediaLogoImage(String imgPath, int width, int height){
		this.imgPath = imgPath;
		this.width = width;
		this.height = height;
	}

	public String getImgPath() {
		return imgPath;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
}
