package com.org.Spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/12/6 19:10
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class CreateSpider1 implements PageProcessor {
//    static private String URL_LIST="/book/\\d+/";
    static private String Url_List="https://movie.douban.com/subject/\\d+/";
    //爬虫配置                    重试次数              抓取间隔为一秒
    private Site site=Site.me()
            .setSleepTime(1000)
            .setRetrySleepTime(3)
            .addCookie("HMACCOUNT","82F6B76D6C30321E")
            .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:100.0) Gecko/20100101 Firefox/100.0");
    //     爬取逻辑
    public void process(Page page) {
        // //*[@id="content"]/div/div[1]/ol/li[1]/div/div[2]/div[1]/a
        page.putField("Url",page.getUrl().regex(Url_List).all());
        page.putField("title",page.getHtml().xpath("//ol[@class='grid_view']/li/div[@class='item']/div[@class='info']/div[@class='hd']/a/span[1]/text()").all());
        page.addTargetRequests(page.getHtml().links().regex(Url_List).all());

    }

    // 获取站点
    public Site getSite() {
        return site;
    }
}
