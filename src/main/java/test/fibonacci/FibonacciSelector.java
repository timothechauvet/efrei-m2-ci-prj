package test.fibonacci;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import java.util.Arrays;

public class FibonacciSelector implements MessageSelector {
    @Override
    public boolean accept(Message<?> message) {
        String[] array = message.getPayload().toString().split("\n");

        //In case the first regex didn't produce two distinct array strings
        if(array.length == 1) {
            array = message.getPayload().toString().split("\r\n");
        }

        //Check if two values separated by a \n are passed
        if(array.length < 2) {
            return false;
        }

        //Check if those two values can be parsed as integers
        try {
            Integer.parseInt(array[array.length - 1]);
            Integer.parseInt(array[array.length - 2]);
        } catch(Exception e) {
            return false;
        }

        return true;
    }
}