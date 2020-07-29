package mediastore.database;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mediastore.database.entities.Games;

@Repository
public class MediaDaoImpl implements MediaDao{

	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Games> getAllGames() {
		Query q = entityManager.createQuery("from Games g", Games.class);
        return q.getResultList();
	}
}
