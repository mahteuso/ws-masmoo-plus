package com.client.ws.masmooplus.core.springdoc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI opeApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Masmoo Plus")
                        .description("API para entender o client Masmoo Plus")
                        .version("0.0.1")
                        .license(new License()
                                .name("Masmoo Tecnology"))
                );
    }
}
