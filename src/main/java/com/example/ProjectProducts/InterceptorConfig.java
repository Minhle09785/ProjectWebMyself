package com.example.ProjectProducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.example.ProjectProducts.interceptor.GloballInterceptor;


@Configuration
public class InterceptorConfig {
    @Autowired
    GloballInterceptor globallInterceptor;
    
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(globallInterceptor)
		.addPathPatterns("/**") /* Các đường dẫn hiển thị danh mục sản phẩm */
		.excludePathPatterns("/rest/**","/admin/**","/assets/**"); /* Loại trừ đường dẫn hiển thị danh mục sản phẩm */
	}
}
