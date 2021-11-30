package com.vmware.carDataBase;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServerInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CarDb2Application.class);
    }

}
