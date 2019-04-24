package cn.edu.hhuwtian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by IntelliJ IDEA.
 * author: wzb
 * Date: 2019/4/14 0014
 * Time: 21:22
 * @author wangzibeng
 */


@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class);
    }
}
