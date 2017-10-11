package com.itss.vn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 11-Oct-17.
 * OwnerBy anhvu
 */
public class FakeUtils {

    public static List<News> getAllNews() {
        List<News> newsList = new ArrayList<News>();
        newsList.add(new News("Title 1", "Framgia - From asian to the world", "Hong Son"));
        newsList.add(new News("Title 2", "Framgia - We make it awesome", "Son Nguyen"));
        newsList.add(new News("Title 3", "Framgia - 2012 to 2017", "Mr Son"));
        return newsList;
    }
}
