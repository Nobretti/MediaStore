package mediastore.database.dao;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mediastore.database.entity.Roms;
import mediastore.global.EnumMedia;


@RepositoryRestResource(path="roms")
public interface RomsRepository extends JpaRepository<Roms, Integer>{

	List<Roms> findByMediatype(@Param("mediatype") EnumMedia name, @Param("page") Pageable pageable);

}
