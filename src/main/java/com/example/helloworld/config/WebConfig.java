package com.example.helloworld.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // Add JAXB converter at the top of the list
        converters.add(0, new Jaxb2RootElementHttpMessageConverter());
        // Leave other converters (including Jackson XML) untouched
    }
}
