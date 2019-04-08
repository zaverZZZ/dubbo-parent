package com.zaver.dubbo.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zaver.dubbo.api.model.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName : UserDao
 * @Description TODO
 * @Date : 2019/4/8 21:12
 * @Author ABC
 * @Version 1.0
 * @Explanation ：
 */
@Repository
public interface UserDao extends BaseMapper<User> {

}
