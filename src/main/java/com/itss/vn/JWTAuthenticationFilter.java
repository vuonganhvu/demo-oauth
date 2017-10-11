package com.itss.vn;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created on 12-Oct-17.
 * OwnerBy anhvu
 */
public class JWTAuthenticationFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        Authentication authentication = TokenAuthenticationService.getAuthentication((HttpServletRequest) servletRequest);
        SecurityContextHolder.getContext().getAuthentication();
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
