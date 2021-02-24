package jfm.gateway.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class JfmZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        System.err.println("aaaaaaaaaaaaa");
        return "pre";
    }

    @Override
    public int filterOrder() {
        System.err.println("bbbbbbbbbbbbb");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        //不需要拦截的接口
        List<String> noFilter = new ArrayList<>();
        noFilter.add("/authentication-server/**");

        AntPathMatcher matcher = new AntPathMatcher();
        for (String pattern : noFilter) {//pattern--/user/**
            if (StringUtils.isNotEmpty(pattern) && matcher.match(pattern, request.getRequestURI())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.err.println("ddddddddddddddd");
        return null;
    }
}
