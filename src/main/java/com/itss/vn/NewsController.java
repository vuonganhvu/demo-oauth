package com.itss.vn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 11-Oct-17.
 * OwnerBy anhvu
 */
@RestController
@RequestMapping(value = "/news")
public class NewsController {
    @RequestMapping(method = RequestMethod.GET)
    public List<News> news() {
        // Tham khảo FakeUtils mình có viết trong package Utils để fake dữ liệu nhé
        return FakeUtils.getAllNews();
    }
}
