package com.example.exp2.conf;

import com.example.exp2.filter.ApiLinkFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

//    @Bean
//    public FilterRegistrationBean<ApiLinkFilter> myFilter() {
//        FilterRegistrationBean<ApiLinkFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new ApiLinkFilter());
//        // 设置Filter的URL模式
//        registrationBean.addUrlPatterns("/*");
//        // 设置Filter的执行顺序
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }

    @Bean
    public FilterRegistrationBean<ApiLinkFilter> apiLinkFilterRegistration(ApiLinkFilter filter) {
        FilterRegistrationBean<ApiLinkFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(filter);
        registration.addUrlPatterns("/*"); // 配置过滤路径
        registration.setName("ApiLinkFilter");
        registration.setOrder(1); // 设置优先级
        return registration;
    }
}