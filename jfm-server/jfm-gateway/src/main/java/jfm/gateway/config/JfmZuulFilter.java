package jfm.gateway.config;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import jfm.common.response.ResponseEnum;
import jfm.common.response.ServerResponse;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class JfmZuulFilter extends ZuulFilter {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        //不需要拦截的接口
        List<String> noFilter = new ArrayList<>();
        noFilter.add("/authentication-server/**");
        noFilter.add("/live2d-server/**");


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
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            ServerResponse serverResponse = new ServerResponse();
            serverResponse.setReturnCode(ResponseEnum.UNAUTHORIZED.getCode());
            serverResponse.setReturnMsg(ResponseEnum.UNAUTHORIZED.getValue());

            ctx.addZuulResponseHeader("Content-Type", "application/json;charset=UTF-8");
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody(JSON.toJSONString(serverResponse));
        }else{
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entry = new HttpEntity<>(token, headers);
            ServerResponse serverResponse = restTemplate.postForEntity("http://service-authentication/auth/token", entry, ServerResponse.class).getBody();
            if(!StringUtils.equals(serverResponse.getReturnCode(),ResponseEnum.SUCCESS.getCode())){
                ctx.addZuulResponseHeader("Content-Type", "application/json;charset=UTF-8");
                ctx.setSendZuulResponse(false);
                ctx.setResponseBody(JSON.toJSONString(serverResponse));
            }else{
                /**
                 * 敏感头信息Authorization,Cookie,Set-Cookie默认是不转发的，也就获取不到
                 * 在配置文件里设置zuul.sensitiveHeaders为空，就可以获取到了
                 */
                ctx.addZuulRequestHeader("userid", "test");
            }
        }
        return null;
    }
}
