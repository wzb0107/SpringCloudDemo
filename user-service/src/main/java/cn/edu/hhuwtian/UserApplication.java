package cn.edu.hhuwtian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by IntelliJ IDEA.
 * author: wzb
 * Date: 2019/4/14 0014
 * Time: 19:59
 * @author wangzibeng
 */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.edu.hhuwtian.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
