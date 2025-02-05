package com.example.config;
import com.example.Interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())
//                .addPathPatterns("/main/**")          // Apply to all requests
                .excludePathPatterns("/interceptor", "/register");  // Exclude specific paths
    }
}