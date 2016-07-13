package edu.nju.web.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") != null) {
            return true;
        }
        System.out.println(request.getRequestURI());
        request.getSession().setAttribute("formerUrl", request.getRequestURI());
        response.sendRedirect("/login");

        return false;
    }
}
