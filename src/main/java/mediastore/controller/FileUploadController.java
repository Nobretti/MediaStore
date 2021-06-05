package mediastore.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import mediastore.database.dao.RomsRepository;
import mediastore.database.entity.Roms;
import mediastore.global.Country;
import mediastore.httpd.HttpdClient;

@RestController
public class FileUploadController {
	
	private static final String IMAGES_ON_DISK = "C:\\Users\\nobre\\eclipse\\workspace\\MediaStore\\src\\docker\\httpdmedia\\images";
	
	@Autowired
	RomsRepository romsRepository;
	
	@Autowired
	HttpdClient httpdClient;

	@PostMapping(value = "/saveRom", consumes = {"multipart/form-data"})
	public void handleFileUpload(@RequestPart("image") MultipartFile file, @RequestPart("newrom") RomFormData newRom) throws IOException {
		
		Roms rom = romsRepository.findById(newRom.getMediaSelectedId()).orElse(null);
		
		if(rom != null) {
			saveRom(rom, newRom);
			saveImageOnDisk(rom.getImgpath(), file.getBytes());
			saveImageOnMediaServer(rom.getImgpath(), file.getBytes());
		}
		
	}
	
	private void saveRom(Roms rom, RomFormData newRom) {
		
		rom.setCompany(newRom.getMediaSelectedCompany());
		rom.setDeveloper(newRom.getMediaSelectedDeveloper());
		rom.setReleaseYear(newRom.getMediaSelectedYear());
		rom.setRate(newRom.getMediaSelectedRate());
		rom.setCountry(Country.valueOf(newRom.getMediaSelectedCountry()));
		rom.setLink(newRom.getMediaSelectedMoreInfo());
		rom.setDescription(newRom.getMediaSelectedDescription());
		
		//romsReposihtory.save(rom);
	}
	
	private void saveImageOnDisk(String imgPath, byte[] image) {
		try(FileOutputStream fos = new FileOutputStream(IMAGES_ON_DISK + imgPath)){
			fos.write(image);
			System.out.println(new File(IMAGES_ON_DISK + imgPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void saveImageOnMediaServer(String imgPath, byte[] image) {
		httpdClient.sendImage(imgPath, image);
	}
}
