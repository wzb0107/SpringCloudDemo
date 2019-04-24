package cn.edu.hhuwtian.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * author: wzb
 * Date: 2019/4/14 0014
 * Time: 19:58
 * @author wangzibeng
 */

@Table(name = "user")
@Data
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String userName;
    private String password;
    private int age;
    private int gender;
    private Date birthday;
    private String email;
    private String address;
}