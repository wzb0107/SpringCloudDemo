package cn.edu.hhuwtian.service;

import cn.edu.hhuwtian.mapper.UserMapper;
import cn.edu.hhuwtian.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * author: wzb
 * Date: 2019/4/14 0014
 * Time: 20:07
 * @author wangzibeng
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
