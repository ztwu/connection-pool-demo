package com.ztwu.demo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * created with idea
 * user:ztwu
 * date:2019/5/23
 * description
 */
public class TestMain {

    public static void loadLoggerContext() {
        System.getProperties().put("logback.configurationFile", "conf/logback.xml");
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.setPrintStream(System.err);
        StatusPrinter.print(lc);
    }

    public static void main(String[] args) {
        try {
            loadLoggerContext();
            FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:conf/spring-base.xml");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
