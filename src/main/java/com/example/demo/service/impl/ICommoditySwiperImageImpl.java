package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.CommoditySwiperImage;
import com.example.demo.mapper.CommoditySwiperImageMapper;
import com.example.demo.service.ICommoditySwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CommoditySwiperImageService")
public class ICommoditySwiperImageImpl extends ServiceImpl<CommoditySwiperImageMapper, CommoditySwiperImage> implements ICommoditySwiperImageService{
@Autowired
    private CommoditySwiperImageMapper commoditySwiperImageMapper;

}
