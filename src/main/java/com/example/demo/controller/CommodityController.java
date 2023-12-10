package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Commodity;
import com.example.demo.entity.CommoditySwiperImage;
import com.example.demo.entity.R;
import com.example.demo.entity.SmallType;
import com.example.demo.service.ICommodityService;
import com.example.demo.service.ICommoditySwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private ICommodityService commodityService;

    @Autowired
    private ICommoditySwiperImageService commoditySwiperImageService;
    /**
     查询商品是否能进行轮转
     */
    @GetMapping("/findSwiper")
    public R findSwiper(){
        List<Commodity> swiperCommoditylist = commodityService.list(new QueryWrapper<Commodity>().eq("isSwiper",true).orderByAsc("swiperSort"));
        Map<String,Object> map=new HashMap<>();
        map.put("message",swiperCommoditylist);
        return R.ok(map);
    }

    /**
     查询热卖商品
     */
    @GetMapping("/findHot")
    public R findHot() {
        Page<Commodity> page=new Page<>(0,6);
        Page<Commodity> pageproduct=commodityService.page(page,new QueryWrapper<Commodity>().eq("ishot",true).orderByAsc("Hotdatetime"));
        List<Commodity> hotCommodityList=pageproduct.getRecords();
        Map<String,Object> map=new HashMap<>();
        map.put("message",hotCommodityList);
        return R.ok(map);
    }
    /**
     根据Id查询商品信息
     */
    @GetMapping("/detail")
    public R detail(Integer Com_id){
//        System.out.println(Com_id);
//        List<Commodity> commodity=commodityService.list(new QueryWrapper<Commodity>().eq("Com_id",Com_id));
////        List<CommoditySwiperImage> CommoditySwiperImageList=commoditySwiperImageService.list(new QueryWrapper<CommoditySwiperImage>().eq("commodityId",commodity.getCom_id()).orderByAsc("sort"));
////        commodity.(CommoditySwiperImageList);
//        for(Commodity commodity1:commodity){
//            List<CommoditySwiperImage> CommoditySwiperImageList=commoditySwiperImageService.list(new QueryWrapper<CommoditySwiperImage>().eq("commodityId",commodity1.getCom_id()).orderByAsc("sort"));
//            commodity1.setCommoditySwiperImagesList(CommoditySwiperImageList);
//        }
        System.out.println(Com_id);
        Commodity commodity = commodityService.getById(Com_id);
//        System.out.println(commodity.getCom_id());
        List<CommoditySwiperImage> CommoditySwiperImageList=commoditySwiperImageService.list(new QueryWrapper<CommoditySwiperImage>().eq("commodityId",commodity.getCom_id()).orderByAsc("sort"));
        commodity.setCommoditySwiperImagesList(CommoditySwiperImageList);


        Map<String,Object> map=new HashMap<>();
        map.put("message",commodity);
        return R.ok(map);
    }
}
