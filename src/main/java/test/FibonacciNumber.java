package test;

import org.springframework.messaging.Message;

public class FibonacciNumber {
    public String add(Message<?> message) {
        String[] array = message.getPayload().toString().split("\n");

        //In case the first regex didn't produce two distinct array strings
        if(array.length == 1) {
            array = message.getPayload().toString().split("\r\n");
        }

        int n1 = Integer.parseInt(array[array.length - 1]);
        int n2 = Integer.parseInt(array[array.length - 2]);
        int result = n1 + n2;

        //Print result in console
        System.out.println(result + " (" + n1 + "+" + n2 + ")");

        StringBuilder returnValue = new StringBuilder();

        for(String val : array) {
            returnValue.append(val).append("\n");
        }

        returnValue.append(result);

        return returnValue.toString();
    }
}