package com.xm.springcloud.service.impl;

import com.xm.springcloud.pojo.User;
import com.xm.springcloud.dao.UserMapper;
import com.xm.springcloud.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xm
 * @since 2018-07-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
