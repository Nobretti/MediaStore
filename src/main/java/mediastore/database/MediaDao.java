package mediastore.database;

import java.util.List;

import mediastore.database.entities.Games;

public interface MediaDao {

	public List<Games> getAllGames();
}
