package edu.cmpe275.jobboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author amayd
 *
 */
@Configuration
@EnableSpringDataWebSupport
public class WebConfiguration extends WebMvcConfigurerAdapter {

	/**
	 * @param builder
	 * @return Object
	 */
	@Bean
	@Primary
	public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
		ObjectMapper objectMapper = builder.createXmlMapper(false).build();
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		return objectMapper;

	}

	/**
	 * @return FixedLocaleResolver
	 */
	@Bean
	public FixedLocaleResolver localeResolver() {
		FixedLocaleResolver localeResolver = new FixedLocaleResolver();

		return localeResolver;
	}

}
