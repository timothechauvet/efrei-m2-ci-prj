package test.splitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.integration.annotation.Splitter;
import org.springframework.stereotype.Component;

@Component
public class OrderSplitter {

    @Splitter(inputChannel = "orderInputChannel", outputChannel = "orderSplitterChannel")
    public Collection splitItem(SplitterOrder order) {
        List messages = new ArrayList();

        SplitterPart part = new SplitterPart(SplitterPart.Descriptor.ID, order.getId());
        messages.add(part);

        part = new SplitterPart(SplitterPart.Descriptor.VALUE, String.valueOf(order.getValue()));
        messages.add(part);

        part = new SplitterPart(SplitterPart.Descriptor.PAYMENT_METHOD, order.getPayment_method().toString());
        messages.add(part);

        return messages;
    }
}

