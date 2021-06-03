package com.example;

import com.example.bean.HelloWorld;
import com.example.bean.HiXml;
import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext applicationContextXml = new ClassPathXmlApplicationContext("appContextXml.xml");
        HiXml hiXml = (HiXml) applicationContextXml.getBean("hibean");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldBean");
        System.out.println(helloWorld.getMessage());
        System.out.println(hiXml.getMessage());
    }
}
