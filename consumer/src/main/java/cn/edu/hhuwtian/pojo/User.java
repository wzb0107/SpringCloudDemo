package cn.edu.hhuwtian.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * author: wzb
 * Date: 2019/4/14 0014
 * Time: 19:58
 * @author wangzibeng
 */

@Data
public class User {
    private Long id;
    private String userName;
    private String password;
    private int age;
    private int gender;
    private Date birthday;
    private String email;
    private String address;
}