package test.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}

