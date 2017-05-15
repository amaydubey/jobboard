package edu.cmpe275.jobboard.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author amayd
 *
 */
@Configuration
@EntityScan(basePackages = "edu.cmpe275.jobboard.entity")
public class ApplicationDataSource {
	
}
