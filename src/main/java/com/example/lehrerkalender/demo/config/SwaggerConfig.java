package com.example.lehrerkalender.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Konfiguration für die swagger-ui
 * @class SwaggerConfig
 */
@EnableSwagger2
@PropertySource("classpath:swagger.properties")
@ComponentScan(basePackages = "com.example.lehrerkalender.demo.controller")
@Configuration
public class SwaggerConfig {

    /**
     * @attr Die Version der API
     */
    private static final String SWAGGER_API_VERSION = "1.0";
    /**
     * @attr Der Lizenztext
     */
    private static final String LICENSE_TEXT = "License";

    /**
     * @attr Überschrift für die API
     */
    private static final String TITLE = "Lehrerkalender REST API";
    /**
     * @attr Beschreibung der API
     */
    private static final String DESCRIPTION = "RESTful API for Lehrerkalender";

    /**
     * Baut die API-Info auf
     * @return {@link ApiInfo ApiInfo}
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION)
                .license(LICENSE_TEXT)
                .version(SWAGGER_API_VERSION)
                .build();
    }

    /**
     * Tagt die API
     * @return {@link Docket Docket}
     */
    @Bean
    public Docket tagsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .paths(PathSelectors.regex("/api.*"))
                .build();

    }
}

