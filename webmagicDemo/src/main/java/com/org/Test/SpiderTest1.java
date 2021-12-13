package com.org.Test;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @Author HP
 * @Date 2021/12/7 14:55
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class SpiderTest1 implements PageProcessor {
    public void process(Page page) {
        page.putField("Title",page.getHtml().xpath("//ol[@class='grid_view']/li/div[@class='item']/div[2]/div[@class='hd']/a/span[@class='title']/text()").all());

    }

    private Site site=new Site();
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new SpiderTest1())
                .addUrl("https://movie.douban.com/top250?start=0&filter=")
                .run();
    }
}
