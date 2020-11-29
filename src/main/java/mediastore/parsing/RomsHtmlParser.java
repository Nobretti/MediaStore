package mediastore.parsing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import mediastore.global.Country;
import mediastore.global.EnumMedia;

public class RomsHtmlParser {

	final static String FILENAME = "superNintendoListGames";
	
	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("src/main/resources/wikidata/" + FILENAME +".sql")){
		    File in = new File("src/main/resources/wikidata/"+FILENAME+".html");
			
			Document document = Jsoup.parse(in, null);
			Elements elements = document.select("table tbody tr");
			
			EnumMedia romType;
		    
		    switch(FILENAME) {
			    case "gameBoyListGames":
			    	romType = EnumMedia.ROMSGAMEBOY;
			    	processRoms(romType, elements, fos);
			    	break;
			    case "gameBoyColorListGames":
			    	romType = EnumMedia.ROMSGAMEBOYCOLOR;
			    	processGameBoyColorRoms(romType, elements, fos);
			    	break;
			    case "segaSaturnListGames":
			    	romType = EnumMedia.ROMSSEGASATURN;
			    	processRoms(romType, elements, fos);
			    	break;
			    case "megaDriveListGames":
			    	romType = EnumMedia.ROMSMEGADRIVE;
			    	processRoms(romType, elements, fos);
			    	break;
			    case "nintendoListGames":
			    	romType = EnumMedia.ROMSNES;
			    	processRoms(romType, elements, fos);
			    	break;
			    case "superNintendoListGames":
			    	romType = EnumMedia.ROMSSNES;
			    	processRoms(romType, elements, fos);
			    	break;
			    case "nintendo64ListGames":
			    	romType = EnumMedia.ROMSN64;
			    	processRoms(romType, elements, fos);
			    	break;
			    default:
			    	romType = EnumMedia.ROMSGAMEBOY;
			 }
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void processRoms(EnumMedia romType, Elements elements, FileOutputStream fos) throws IOException {
		for (Element element : elements) {
		    Elements tds = element.children();

		    
		    String romTitle =  tds.get(0).children().get(0).text().equals("") ? removeStrSpecialChars(tds.get(0).children().get(1).text()) : removeStrSpecialChars(tds.get(0).children().get(0).text());
		    String romTitleImg = romTitle.toLowerCase().replaceAll(" ", "");
		    
		    String developer = removeStrSpecialChars(tds.get(1).text());
		    String company = tds.get(2).childrenSize() > 0 ? removeStrSpecialChars(tds.get(2).children().get(0).text()) : removeStrSpecialChars(tds.get(2).text());

		    int index =  romType == EnumMedia.ROMSSEGASATURN ? 4 : romType == EnumMedia.ROMSN64 ? 7 : 5;
		    
		    String[] releasedInAndCountry = generateReleasedInAndCountry(index,tds);
	    	String releasedIn = releasedInAndCountry[0];
	    	Country country = Country.valueOf(releasedInAndCountry[1]);
		    
		    String link = removeStrSpecialChars(tds.get(0).select("a").attr("href"));
		    link = link.length() > 0 ? "https://en.wikipedia.org" + link : "";  
		    
		    String sqlStatement = "insert into Roms(shortname, description, developer, company, mediaType, releaseYear, country, humanstate, rate, imgpath, link) values ('" + romTitle + "','" + 
		    												romTitle + "','"+ developer + "','" + company + "','"+ romType.name() +"','"+releasedIn+"','" + country + "','PROGRESSING',1, '/roms/gameboy/" + romTitleImg + ".jpg','"+link+"');\n";
		    fos.write(sqlStatement.getBytes());
		}
	}
	
	private static void processGameBoyColorRoms(EnumMedia romType, Elements elements, FileOutputStream fos) throws IOException {
		
		boolean changeReleaseInEuRead = false;
		
		for (Element element : elements) {
		    Elements tds = element.children();

		    
		    String romTitle =  tds.get(0).children().get(0).text().equals("") ? removeStrSpecialChars(tds.get(0).children().get(1).text()) : removeStrSpecialChars(tds.get(0).children().get(0).text());
		    String romTitleImg = romTitle.toLowerCase().replaceAll(" ", "");
		    
		    String developer = removeStrSpecialChars(tds.get(3).text());
		    String company = tds.get(4).childrenSize() > 0 ? removeStrSpecialChars(tds.get(4).children().get(0).text()) : removeStrSpecialChars(tds.get(4).text());

		    if(romTitle.equals("F1 Championship Season 2000")) {
			    changeReleaseInEuRead = true;
		    }
		    
		    String releasedIn;
		    Country country = Country.EU;
		    
		    if(changeReleaseInEuRead) {
		    	String[] releasedInAndCountry = generateReleasedInAndCountry(8,tds);
		    	releasedIn = releasedInAndCountry[0];
		    	country = Country.valueOf(releasedInAndCountry[1]);
		    }
		    else {
		    	releasedIn = removeStrSpecialChars(tds.get(5).child(0).ownText());
		    }
		    
		    String link = removeStrSpecialChars(tds.get(0).select("a").attr("href"));
		    link = link.length() > 0 ? "https://en.wikipedia.org" + link : "";
		    
		    String sqlStatement = "insert into Roms(shortname, description, developer, company, mediaType, releaseYear, country, humanstate, rate, imgpath, link) values ('" + romTitle + "','" + 
		    												romTitle + "','"+ developer + "','" + company + "','"+ romType.name() +"','"+releasedIn+"','" + country.name() + "','PROGRESSING',1, '/roms/gameboy/" + romTitleImg + ".jpg','"+link+"');\n";
		    fos.write(sqlStatement.getBytes());
		}
	}

	private static String[] generateReleasedInAndCountry(int index, Elements tds) {
		String releasedIn;
	    Country country = Country.EU;
	    
	    releasedIn = removeStrSpecialChars(tds.get(index).text());
    	if(releasedIn.equals("")) {
    		country = Country.US;
    		releasedIn = removeStrSpecialChars(tds.get(index-1).text());
    		if(releasedIn.equals("")) {
    			country = Country.JP;
    			releasedIn = removeStrSpecialChars(tds.get(index-2).text());
    		}
    	}
    	
    	return new String[] { releasedIn, country.name() };
	}
	
	private static String removeStrSpecialChars(String in) {
		char specialChar = '"';
		return in.replaceAll("['-+.^:,&*!?"+specialChar+"]","");
	}

}
