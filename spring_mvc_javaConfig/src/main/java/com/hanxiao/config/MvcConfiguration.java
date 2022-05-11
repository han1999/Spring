package com.hanxiao.config;

import com.hanxiao.converter.StringToDateConverter;
import com.hanxiao.interceptor.CustomInterceptor;
import com.hanxiao.interceptor.CustomInterceptor2;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import java.util.Locale;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/10
 **/
@EnableWebMvc
@ComponentScan("com.hanxiao.controller")
public class MvcConfiguration implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor());
        registry.addInterceptor(new CustomInterceptor2()).addPathPatterns("/hello/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pic1/**").addResourceLocations("/");
        registry.addResourceHandler("/pic2/**").addResourceLocations("classpath:/");
        registry.addResourceHandler("/pic3/**").addResourceLocations("file:C:\\Users\\hx\\Pictures\\Saved Pictures\\壁纸\\wallpaper/");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToDateConverter());
    }

    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setProviderClass(HibernateValidator.class);
        return localValidatorFactoryBean;
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }

    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setCookieName("lang");
        cookieLocaleResolver.setDefaultLocale(Locale.CHINA);
        return cookieLocaleResolver;
    }
}
