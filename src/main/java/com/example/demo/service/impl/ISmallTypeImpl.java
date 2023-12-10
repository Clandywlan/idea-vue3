package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.SmallType;

import com.example.demo.mapper.SmallTypeMapper;
import com.example.demo.service.SmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("smallTypeService")
public class ISmallTypeImpl extends ServiceImpl<SmallTypeMapper, SmallType> implements SmallTypeService {
    @Autowired
    private SmallTypeMapper smallTypeMapper;
}
