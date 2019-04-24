package cn.edu.hhuwtian.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/22 0022
 * Time: 12:44
 */

@Component
public class TestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取上下文
        RequestContext requestContext = RequestContext.getCurrentContext();
        //获取request
        HttpServletRequest request = requestContext.getRequest();
        //获取access-token
        String token = request.getParameter("access-token");
        if (StringUtils.isBlank(token)) {
            //不存在拦截
            requestContext.setSendZuulResponse(false);
            //返回403
            requestContext.setResponseStatusCode(403);
        }
        return null;
    }
}
