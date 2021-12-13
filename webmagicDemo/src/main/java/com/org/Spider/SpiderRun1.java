package com.org.Spider;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

/**
 * @Author HP
 * @Date 2021/12/6 19:16
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class SpiderRun1 {
    public static void main(String[] args) {
        Spider.create(new CreateSpider1()).addUrl("https://movie.douban.com/top250?start=0&filter=")
                .thread(5)
                // 把数据打印到控制台
                .addPipeline(new ConsolePipeline())
                .run();
    }
}
