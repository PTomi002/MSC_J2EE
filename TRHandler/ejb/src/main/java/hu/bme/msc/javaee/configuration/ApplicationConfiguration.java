package hu.bme.msc.javaee.configuration;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
@LocalBean
@Startup
@Named
public class ApplicationConfiguration {
	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationConfiguration.class);

	@PostConstruct
	private void init() {
		LOGGER.info("<<< Loading application configuration >>>");
	}
}