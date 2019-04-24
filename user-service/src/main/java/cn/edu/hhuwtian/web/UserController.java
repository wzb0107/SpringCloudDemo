package cn.edu.hhuwtian.web;

import cn.edu.hhuwtian.pojo.User;
import cn.edu.hhuwtian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Date: 2019/4/14 0014
 * Time: 20:11
 * @author wangzibeng
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") Long id) {
        return userService.queryUserById(id);
    }

}
