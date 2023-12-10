package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.BigType;
import com.example.demo.entity.Commodity;
import com.example.demo.entity.R;
import com.example.demo.entity.SmallType;
import com.example.demo.service.BigTypeService;
import com.example.demo.service.SmallTypeService;
import com.example.demo.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/BigType")
public class BigTypeController {
    @Autowired
    private BigTypeService bigTypeService;
    @Autowired
    private SmallTypeService smallTypeService;

    @Autowired
    private ICommodityService commodityService;



    @GetMapping("/findall")
    public R findall(){
        List<BigType> BigType=bigTypeService.list();
        Map<String,Object> map=new HashMap<>();
        map.put("message",BigType);
        return R.ok(map);
    }

    @GetMapping("/findListSmallType")
    public R findListSmallType(){
        List<BigType> BigTypeList=bigTypeService.list();
        for (BigType bigType:BigTypeList
             ) {
            List<SmallType> smallTypeList=smallTypeService.list(new QueryWrapper<SmallType>().eq("bigTypeID",bigType.getTypeID()));
            bigType.setSmallTypeList(smallTypeList);
            for(SmallType smallType:smallTypeList){
                List<Commodity> commodityList=commodityService.list(new QueryWrapper<Commodity>().eq("typeID",smallType.getId()));
                smallType.setCommodityList(commodityList);
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("message",BigTypeList);
        return R.ok(map);
    }
}
