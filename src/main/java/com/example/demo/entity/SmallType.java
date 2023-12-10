package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;


@TableName("smalltype")
@Data
public class SmallType {
    private Integer id;
    private String name;
    private String remark;
    private Integer bigTypeID;

    @TableField(select = false)
    private BigType bigType;

    @TableField(select = false)
    private List<Commodity> commodityList;
}
