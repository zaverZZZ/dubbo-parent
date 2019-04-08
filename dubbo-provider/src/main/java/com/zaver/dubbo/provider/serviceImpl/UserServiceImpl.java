package com.zaver.dubbo.provider.serviceImpl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaver.dubbo.api.model.User;
import com.zaver.dubbo.api.service.UserService;
import com.zaver.dubbo.provider.dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : UserService
 * @Description TODO
 * @Date : 2019/4/8 18:15
 * @Author ABC
 * @Version 1.0
 * @Explanation ：
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

/*    @Override
    public List<User> userList() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setCreateTime(1L);
        user.setId(1);
        user.setNickName("1");
        user.setPassWord("1");
        user.setUserName("1");
        list.add(user);
        return list;
    }*/
}
