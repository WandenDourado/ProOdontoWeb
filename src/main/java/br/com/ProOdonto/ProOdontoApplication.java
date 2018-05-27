package br.com.ProOdonto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProOdontoApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProOdontoApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProOdontoApplication.class, args);
    }

	/*public static void main(String[] args) {
		SpringApplication.run(ProOdontoApplication.class, args);
	} */
}
