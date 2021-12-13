package com.org.Test;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/12/7 18:09
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class SpiderTest2 implements PageProcessor {
    public void process(Page page) {
        page.putField("Title",page.getHtml().xpath("/html/body/div[2]/ul/li/a/p[1]/text()").all());
        // /html/body/div[2]/ul/li[1]/a
        page.putField("Url",page.getHtml().xpath("/html/body/div[2]/ul/li/a/@href").all());
        String url = page.getResultItems().get("Url").toString();
        List<String> urllist = new ArrayList<String>();
        System.out.println(url);
        String[] split = url.split(",");
        for (String s : split) {
            String fillurl = "https://m.9txs.org".concat(s);
            urllist.add(fillurl);
            System.out.println(fillurl);
        }

        page.addTargetRequest(urllist.get(0).replace("[",""));
        System.out.println(page.getTargetRequests());
        ////*[@id="info"]/div[2]/div[3]/div[2]/p[1]
        page.putField("ttime",page.getHtml().xpath("//*[@id=\"info\"]/div[2]/div[3]/div[2]/p[1]/text()").get());
        System.out.println("请求的页面"+page.getTargetRequests());


//        List<String> all = page.getHtml().links().xpath("/html/body/div[2]/ul/li/a/@href").all();
//        System.out.println(all.size());
        /**
         List<String> urllist = new ArrayList<String>();
        if (null != all && all.size() !=0){
            for (String s : all) {
                String url ="https://m.9txs.org"+s;
                urllist.add(url);
            }
        }
        System.out.println(urllist);
         **/
        /**
        page.addTargetRequests(urllist);

        // /html/body/div[2]/div[3]/div[2]/p[1]
        page.putField("brief",page.getHtml().xpath("/html/body/div[2]/div[3]/div[2]/p[1]/text()").get());

        **/
    }

    private Site site=Site.me().setSleepTime(1000)
            .setRetrySleepTime(3)
            .addCookie("HMACCOUNT","82F6B76D6C30321E")
            .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:100.0) Gecko/20100101 Firefox/100.0");
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new SpiderTest2() ).addUrl("https://m.9txs.org/library.html").thread(5).run();
    }
}
