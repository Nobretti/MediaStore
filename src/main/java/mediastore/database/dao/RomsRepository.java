package mediastore.database.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mediastore.database.entity.Roms;


@RepositoryRestResource(path="roms")
public interface RomsRepository extends JpaRepository<Roms, Integer>{

}
