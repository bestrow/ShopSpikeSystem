package com.example;

import java.util.HashMap;
import java.util.Map;

import com.example.rabbitmq.ProduceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ProduceService messageProducer = (ProduceService) context.getBean("produceService");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", "hello rabbitmq");
        // 注意：第二个属性是 Queue 与 交换机绑定的路由
        messageProducer.sendQueue("test_mq_exchange", "test_mq_patt", map);
    }

}
