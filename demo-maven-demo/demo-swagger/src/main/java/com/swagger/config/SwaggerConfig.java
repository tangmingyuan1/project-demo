package com.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置swagger
 * 访问路径：通过项目路径+swagger-ui.html打开接口文档
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
//设定全局code为0表示成功，200表示失败
        List<ResponseMessage> responseMessageList = new ArrayList<>();
        responseMessageList.add(new ResponseMessageBuilder().code(200).message("成功").build());
        responseMessageList.add(new ResponseMessageBuilder().code(103).message("添加失败").build());
        responseMessageList.add(new ResponseMessageBuilder().code(104).message("更新失败").build());
        responseMessageList.add(new ResponseMessageBuilder().code(105).message("删除失败").build());
        responseMessageList.add(new ResponseMessageBuilder().code(500).message("异常返回").build());

        return new Docket(DocumentationType.SWAGGER_2)
                .globalResponseMessage(RequestMethod.GET, responseMessageList)
                .globalResponseMessage(RequestMethod.POST, responseMessageList)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.swagger.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /***
     * 构建 api文档的详细信息函数
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("标题--api接口文档")
                .description("详细信息。。。。")
                .termsOfServiceUrl("http://www.by-health.com/")
                .contact(new Contact("MouYe", "url", "email"))
                .version("1.0")
                .build();
    }
}
