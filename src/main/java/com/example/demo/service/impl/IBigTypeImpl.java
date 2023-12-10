package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.BigType;
import com.example.demo.mapper.BigTypeMapper;
import com.example.demo.service.BigTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bigTypeService")
public class IBigTypeImpl extends ServiceImpl<BigTypeMapper, BigType> implements BigTypeService {
    @Autowired
    private BigTypeMapper bigTypeMapper;
}
