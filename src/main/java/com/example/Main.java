package com.example;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("This is an example");
        MyBean myBean = new MyBean("Tom", 17);
        log.info("MyBean:{}", JSON.toJSONString(myBean));
    }
}
