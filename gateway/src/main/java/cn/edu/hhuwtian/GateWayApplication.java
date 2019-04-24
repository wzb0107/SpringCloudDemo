package cn.edu.hhuwtian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/22 0022
 * Time: 11:05
 */

@EnableZuulProxy
@SpringBootApplication

public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
