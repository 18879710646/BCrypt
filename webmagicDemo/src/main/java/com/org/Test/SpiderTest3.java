package com.org.Test;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @Author HP
 * @Date 2021/12/8 09:14
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class SpiderTest3 implements PageProcessor {
    //https://xs.sogou.com/0_0_0_0_heat/
    private String Url_List="https://xs.sogou.com/29_+\\d+_+\\d+_+\\d+_+\\w";
    public void process(Page page) {
        if (page.getUrl().regex(Url_List).match()){
            // /html/body/div[2]/div[2]/div[2]/ul/li[1]/a
            page.addTargetRequests(page.getHtml().xpath("/html/body/div[2]/div[2]/div[2]/ul/li/a/@href").all());
            page.addTargetRequests(page.getHtml().links().regex(Url_List).all());
        }
        else {
            // /html/body/div[4]/div[2]/div[1]/div[2]/div/h1/a
            page.putField("title",page.getHtml().xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/h1/a/text()"));
        }
    }
    Site site=Site.me().setUserAgent("User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400");
    public Site getSite() {
        return site;
    }
    public static void main(String[] args) {
        Spider.create(new SpiderTest3()).addUrl("https://xs.sogou.com/0_0_0_0_heat/").thread(5).run();
    }
}
