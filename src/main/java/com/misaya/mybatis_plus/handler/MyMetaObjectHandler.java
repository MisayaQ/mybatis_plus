package com.misaya.mybatis_plus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: mybatis_plus
 * @description:
 * @version: 1.0
 * @author: Jia_Q
 * @create: 2020-07-26 21:40
 **/
@Slf4j
@Component//一定不要忘记把处理器加入到IOC容器中
public class MyMetaObjectHandler implements MetaObjectHandler {
    //插入时候的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill...");
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    //更新时候的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill...");
        this.setFieldValByName("updateTime", new Date(), metaObject);    }
}
