package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwiperConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/swiper/**").addResourceLocations("file:D:\\WeChatImage\\TestSwiper\\");
        registry.addResourceHandler("/image/bigType/**").addResourceLocations("file:D:\\WeChatImage\\bigType\\");
        registry.addResourceHandler("/image/commodityHot/**").addResourceLocations("file:D:\\WeChatImage\\commodityHot\\");
        registry.addResourceHandler("/image/CommoditySwiperImage/**").addResourceLocations("file:D:\\WeChatImage\\CommoditySwiperImage\\");
    }
}
