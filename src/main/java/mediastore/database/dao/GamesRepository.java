package mediastore.database.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mediastore.database.entity.Games;


@RepositoryRestResource(path="games")
public interface GamesRepository extends JpaRepository<Games, Integer>{

}
