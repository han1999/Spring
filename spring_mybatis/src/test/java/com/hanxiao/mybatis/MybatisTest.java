package com.hanxiao.mybatis;

import com.hanxiao.mybatis.bean.User;
import com.hanxiao.mybatis.mapper.UserMapper;
import com.hanxiao.mybatis.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MybatisTest {
    static SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;

    @Autowired
    UserService userService;
    @BeforeClass
    public static void beforeClass() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Before
    public void before() {
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByPrimaryKey() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println("user = " + user);
    }

    @Test
    public void testSelectUserByPrimaryKeyInUserServiceImpl() {
        User user = userService.selectUserByPrimaryKey(1);
        System.out.println("user = " + user);
    }

}
