package test.splitter;

import java.text.MessageFormat;
import java.util.Map;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

@Component
public class SplitterPartsProcessor {
    @ServiceActivator(inputChannel = "orderSplitterChannel")
    public void handlePart(SplitterPart data, @Headers Map headerMap) {

        System.out.println(
                MessageFormat.format("Message with {0} : {1}", data.getDescriptor().toString(), data.getValue()));

        System.out.print("Headers -- ");
        for (Object key : headerMap.keySet()) {
            Object value = headerMap.get(key);
            if (key != "sequenceSize" && key != "timestamp")
                System.out.print(MessageFormat.format("{0} : {1}. ", key, value));
        }

        System.out.println();
    }
}