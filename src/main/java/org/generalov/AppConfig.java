package org.generalov;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("org.generalov")
public class AppConfig {

}
