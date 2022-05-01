package com.hanxiao.mybatis.service;

import com.hanxiao.mybatis.bean.User;
import com.hanxiao.mybatis.mapper.UserMapper;
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
