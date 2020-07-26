package com.misaya.mybatis_plus.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //对应数据库中的主键(uuid，自增id，雪花算法，redis，zookeeper)
    //默认：ID_WORKER
    @TableId(type = IdType.INPUT)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    // 字段添加填充内容
//    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

//    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
