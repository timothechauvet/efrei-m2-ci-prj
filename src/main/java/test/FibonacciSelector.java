package test;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class FibonacciSelector implements MessageSelector {
    @Override
    public boolean accept(Message<?> message) {
        System.out.println("\n\nDEBUT\n" + message.getPayload().toString());

        String[] array = message.getPayload().toString().split("\r\n");
        System.out.println("\n\n-----------------------\n'" + array[1] + "'");

        //Check if two values separated by a \n are passed
        if(array.length != 2)
            return false;

        //Check if those two values can be parsed as integers
        try {
            System.out.println("\n\n-----------------------\n");
            System.out.println(Integer.parseInt(array[0]));
            System.out.println(Integer.parseInt(array[1]));
        } catch(Exception e) {
            return false;
        }

        return true;
    }
}