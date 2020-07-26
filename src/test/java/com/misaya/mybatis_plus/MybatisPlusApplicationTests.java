package com.misaya.mybatis_plus;

import com.misaya.mybatis_plus.mapper.UserMapper;
import com.misaya.mybatis_plus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    // 继承了BaseMapper，所有的方法都来自己父类
    // 我们也可以编写自己的扩展方法！
    @Autowired
    private UserMapper userMapper;


    @Test
    void contextLoads() {
        // 参数是一个 Wrapper ，条件构造器，这里我们先不用 null
        // 查询全部用户
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    // 测试插入
    @Test
    public void testInsert(){
        User user = new User();
        user.setId(6L);
        user.setName("MisayaQ");
        user.setAge(3);
        user.setEmail("516802581@qq.com");
        int result = userMapper.insert(user);//会帮我们自动生成id
        System.out.println(result);//受影响的行数
        System.out.println(user);//发现ID自动回填
    }

    @Test
    public void testUpdate() {
        User user = new User();
        //通过条件自动拼接sql
        user.setId(6L);
        user.setName("ZywForever");
        user.setAge(18);
        //updateById  但是参数是一个 对象
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

}
