package com.el.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author roman zhangfei
 * @Date 2019/12/5 10:40
 * @Version V1.0
 */
@Configuration
@ConditionalOnProperty(prefix = "swagger",value = {"enable"},havingValue = "true")
public class SwaggerCOnfiguration {
    @Bean
    public Docket buildDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                //要扫描的API基础包
                .apis(RequestHandlerSelectors.basePackage("com.el"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * 构建API基本信息
     * @return
     */
    private ApiInfo buildApiInfo(){
        return new ApiInfoBuilder().title("api文档")
                .description("API")
                .version("1.0").build();
    }
}