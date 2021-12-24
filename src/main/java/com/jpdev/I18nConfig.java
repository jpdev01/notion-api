package com.jpdev;

import com.jpdev.i18n.I18nFilterConfigImpl;
import i18n.filter.I18nFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class I18nConfig {

    @Bean
    public FilterRegistrationBean internalFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new I18nFilterConfigImpl());
        registration.addUrlPatterns("/*");
        registration.setName("i18nInternalFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean dependencyFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new I18nFilter());
        registration.addUrlPatterns("/*");
        registration.setName("i18nFilter");
        registration.setOrder(2);
        return registration;
    }
}
