package com.alsace.crawler;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.security.auth.login.LoginContext;
import java.io.IOException;
import java.util.Objects;

@SpringBootTest
@Slf4j
public class JsoupTest {

    @Test
    public void test() {
        try {
            Document doc = Jsoup.connect("https://www.douban.com/group/gz_rent/discussion?start=0").get();
            Element body = doc.body();
            Elements tables = body.getElementsByClass("olt");
            Element table = tables.get(0);
            Element tbody = table.getAllElements().get(0);
            Elements trs = tbody.getAllElements();
            for (Element tr : trs) {
                if (trs.indexOf(tr) == 0) {
                    continue;
                }
                Element title = tr.getElementsByClass("title").get(0);
                title.getElementsByTag("");
            }

        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

    }
}
