package mediastore;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

import mediastore.database.entity.Roms;

@Component
public class RestRepositoryConfiguration  implements RepositoryRestConfigurer{

	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Roms.class);
	}

}
