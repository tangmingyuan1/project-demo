package com.swagger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@MapperScan(basePackages = {"com.swagger.mapper"})
@ServletComponentScan//Servlet（控制器）、Filter（过滤器）、Listener（监听器）可以直接通过@WebServlet、@WebFilter、@WebListener注解自动注册到Spring容器中，无需其他代码。
@EnableCaching//springboot自带缓存 在需要缓存的接口上使用@Cacheable注解
public class SwaggerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SwaggerServiceApplication.class, args);

    }
}
