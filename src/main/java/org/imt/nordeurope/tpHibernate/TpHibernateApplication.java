package org.imt.nordeurope.tpHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.imt.nordeurope.tpHibernate")
@SpringBootApplication
public class TpHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpHibernateApplication.class, args);
	}

}
