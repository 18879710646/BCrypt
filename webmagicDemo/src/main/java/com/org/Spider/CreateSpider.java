package com.org.Spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author HP
 * @Date 2021/12/6 14:04
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

/**
 * 获取到书名
 *   Selectable xpath = html.xpath("//ul/li/div[@class='info fl']/h3/a/text()");
 *         System.out.println(xpath.toString());
 */
public class CreateSpider implements PageProcessor {
    static private String URL_LIST="/book/\\d+/";
                //爬虫配置                    重试次数              抓取间隔为一秒
    private Site site=Site.me()
                        .setSleepTime(1000)
                        .setRetrySleepTime(3)
                        .addCookie("HMACCOUNT","82F6B76D6C30321E")
                        .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:100.0) Gecko/20100101 Firefox/100.0");
//     爬取逻辑
    public void process(Page page) {
        // 爬取所有的小说Url
        List<String> all = page.getHtml().links().regex(URL_LIST).all();
        LinkedHashSet linkedHashSet = processPage(all);
        List<String> list=new ArrayList<String>(linkedHashSet.size());
        for (Object listurl : linkedHashSet) {
            list.add(listurl.toString());
        }


        for (String url : list) {
            page.addTargetRequest(url);

        }
        addTitile(page);
    }
    //     所有小说URL去重
    public LinkedHashSet processPage(List<String> urllist){
        LinkedHashSet<String> arrayLists = new LinkedHashSet<String>();
        for (String s : urllist) {
            arrayLists.add(s);
        }
        return arrayLists;
    }

    //获取到小说titile
    private void addTitile(Page page) {
        Selectable xpath = page.getHtml().xpath("//ul/li/div[@class='info fl']/h3/a/text()");
        System.out.println(xpath);
    }

// 获取站点
    public Site getSite() {
        return Site.me();
    }
}
