package cn.edu.hhuwtian.client;

import cn.edu.hhuwtian.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangzibeng
 */

@FeignClient("user-service")
public interface UserClient {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") long id);

}
