package com.org.Spider;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

/**
 * @Author HP
 * @Date 2021/12/6 15:44
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class SpiderRun {
    public static void main(String[] args) {
        // 创建一个爬虫     new 爬虫             需要爬取的地址                   线程数
        Spider.create(new CreateSpider()).addUrl("https://xs.sogou.com/47_0_0_0_heat/")
                .thread(5)
                // 把数据打印到控制台
                .addPipeline(new ConsolePipeline())
                .run();
    }
}
