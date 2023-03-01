package com.lyz.his.util;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

/**
 * Servlet Filter implementation class CorsFilter
 */
//@WebFilter(dispatcherTypes = {
//				DispatcherType.REQUEST, 
//				DispatcherType.FORWARD, 
//				DispatcherType.INCLUDE, 
//				DispatcherType.ERROR
//		}
//					, urlPatterns = { "/*" })
@Component
public class CorsFilter implements Filter
{

    /**
     * Default constructor.
     */
    public CorsFilter()
    {
        System.out.println("过滤器启动");
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy()
    {
        System.out.println("过滤器销毁");
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {

        System.out.println("过滤器运行");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
//		跨域访问
        res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
//      如果希望前端直接传递JSON，后台直接接收JSON，则需要加入32行和33行代码，无论前端是普通vue项目还是脚手架项目都能通过
        res.setHeader("Access-Control-Allow-Headers", req.getHeader("Access-Control-Request-Headers"));
        res.setHeader("Access-Control-Allow-Methods", "*");
//		允许Ajax或axios发送cookie的必要设置
        res.setHeader("Access-Control-Allow-Credentials", "true");
//		乱码处理
        req.setCharacterEncoding("utf-8");
        res.setCharacterEncoding("utf-8");
        // pass the request along the filter chain
        chain.doFilter(request, response);

    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException
    {
    }

}
