package cn.edu.hhuwtian.web;

import cn.edu.hhuwtian.client.UserClient;
import cn.edu.hhuwtian.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by IntelliJ IDEA.
 * Date: 2019/4/14 0014
 * Time: 20:38
 *
 * @author wangzibeng
 */

@RestController
@SuppressWarnings("all")
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

   /* @Autowired
    private RibbonLoadBalancerClient client;*/
/*
    @GetMapping("{id}")
    public User consumer(@PathVariable("id") Long id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }*/
/*
    @GetMapping("{id}")
    public User consumer2(@PathVariable("id") Long id) {
        ServiceInstance serviceInstance = client.choose("user-service");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }*/

   /* @GetMapping("{id}")
    public User consumer(@PathVariable("id") Long id) {
        String url = "http://user-service/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }
    */


    //   @HystrixCommand(fallbackMethod = "queryByIdFallBack")
    @HystrixCommand
    @GetMapping("{id}")
    public User consumer(@PathVariable("id") Long id) {
        //String url = "http://user-service/user/" + id;
        return userClient.queryById(id);
    }

    public String queryByIdFallBack(long id) {
        return "服务器错误！";
    }
}
