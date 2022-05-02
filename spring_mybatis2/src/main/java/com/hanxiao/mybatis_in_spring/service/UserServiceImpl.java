package com.hanxiao.mybatis_in_spring.service;


import com.hanxiao.mybatis_in_spring.bean.User;
import com.hanxiao.mybatis_in_spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/

@Component
public class UserServiceImpl implements UserService {

    //sqlFactory不会给提示，这个可能是在运行时才能看出来有工厂
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;

    //为什么吧Autowired注释掉，程序还是能跑？ 因为我test里面直接用的是userMapper，omg头脑不清楚了
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByPrimaryKey(Integer id) {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer insertUser(User user) {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.insertUser(user);
    }
}
