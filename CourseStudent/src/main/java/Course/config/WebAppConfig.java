package Course.config;

/*
Course.config
Tarih: 24.05.2022, Saat: 11:52, Author: Grey 
*/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@ComponentScan("course")
@EnableWebMvc

public class WebAppConfig {
}
