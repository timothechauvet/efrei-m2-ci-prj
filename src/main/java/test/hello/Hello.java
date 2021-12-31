package test.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class Hello {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);

        Message<String> message = MessageBuilder.withPayload("World").build();

        channel.send(message);
    }
}
