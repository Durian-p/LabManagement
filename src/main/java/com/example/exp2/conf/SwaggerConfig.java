//package com.example.exp2.conf;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//
//@Configuration
//@EnableOpenApi
//public class SwaggerConfig {
//    @Bean
//    public Docket docket() {
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(apiInfo()).enable(true)
//                .select()
//                //apis： 添加swagger接口提取范围
//                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("实验室物资管理系统")
//                .description("SOA实验二")
//                .contact(new Contact("汪汪队", "",""))
//                .version("v1.0")
//                .build();
//    }
//}
//
