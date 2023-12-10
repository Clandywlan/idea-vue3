package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@TableName("commodity")
@Data
public class Commodity {
    @TableId
    private Integer Com_id;
    private String Com_img;
    private Integer Inventory;
    private String Com_incroduction;
    private BigDecimal Com_price;
    private String Com_name;
    private boolean ishot=false;
    private boolean isSwiper=false;
    private String description;
    private Integer swiperSort=0;
    private String SwiperPic="default.jpg";
   @JsonSerialize(using = CustomDateTimeSerializer.class)// 日期json序列化
    private Date Hotdatetime;
   @TableField(select = false)
   private List<CommoditySwiperImage> commoditySwiperImagesList;
}
