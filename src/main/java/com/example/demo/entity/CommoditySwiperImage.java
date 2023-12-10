package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_commodity_swiper_image")
@Data
public class CommoditySwiperImage {
    private Integer id;
    private String image;
    private String sort;
    private Integer commodityId;
}
