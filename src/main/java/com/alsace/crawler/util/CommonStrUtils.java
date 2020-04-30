package com.alsace.crawler.util;

import java.util.UUID;

public class CommonStrUtils {

    public String getBeautyUUID() {
        return UUID.randomUUID()
                .toString()
                .replace("-", "")
                .toUpperCase();
    }


}
