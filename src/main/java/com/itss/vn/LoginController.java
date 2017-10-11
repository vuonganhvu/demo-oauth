package com.itss.vn;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 12-Oct-17.
 * OwnerBy anhvu
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {
    static final String TOKEN_PREFIX = "Username";
    @RequestMapping(method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response) {
        // Tham khảo FakeUtils mình có viết trong package Utils để fake dữ liệu nhé
        String token = TokenAuthenticationService.createToken(request.getHeader(TOKEN_PREFIX));
        Authentication authentication = TokenAuthenticationService.getAuthentication(token);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return token;
    }
}
