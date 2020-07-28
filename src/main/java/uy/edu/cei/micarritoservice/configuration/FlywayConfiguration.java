package uy.edu.cei.micarritoservice.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfiguration {
	/**
	 * elimina todas las tablas de la base de datos
	 * corre las migraciones
	 * @return
	 */
	@Bean
	public FlywayMigrationStrategy migrationStategy() {
		return new FlywayMigrationStrategy() { // implementacion anonima de la interface FlywayMigrationStrategy
			@Override
			public void migrate(Flyway flyway) {
				flyway.clean();
				flyway.migrate();
			}
		};
	}
}
