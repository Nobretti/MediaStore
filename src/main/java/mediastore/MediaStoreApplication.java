package mediastore;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mediastore.database.MediaDao;
import mediastore.database.entities.Games;

@SpringBootApplication
public class MediaStoreApplication {

	public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MediaStoreApplication.class, args);
        MediaDao mediaDao = applicationContext.getBean(MediaDao.class);
		
		List<Games> games = mediaDao.getAllGames();
		System.out.println("Games Size: " + games.size());
	}

}
