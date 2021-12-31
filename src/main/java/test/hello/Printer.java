package test.hello;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    @ServiceActivator
    public void printValue(String value){
        System.out.println(value);
    }
}
