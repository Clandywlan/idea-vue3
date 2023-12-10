package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName("bigtype")
@Data
public class BigType implements Serializable {
    private Integer TypeID;
    private String name;
    private String remark;
    private String image;

    @TableField(select = false)
    private List<SmallType> smallTypeList;
}
