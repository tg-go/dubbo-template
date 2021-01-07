package com.nnynn.dubbo.consumer;

import com.nnynn.dubbo.api.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EchoConsumer {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/consumer.xml"});
        context.start();
        EchoService echoService = (EchoService) context.getBean("echoService");
        String status = echoService.echo("Hello World");
        System.out.println("echo result:" + status);
        for(int i = 0; i < Integer.MAX_VALUE;i++){
            echoService.echo("Hello World");
            Thread.sleep(1000);
        }
    }
}
