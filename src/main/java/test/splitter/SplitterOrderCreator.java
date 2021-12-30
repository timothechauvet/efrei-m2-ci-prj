package test.splitter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SplitterOrderCreator {
    public List createOrders() {
        List orders = new ArrayList();

        SplitterOrder order = new SplitterOrder();
        order.setId("1001");
        order.setValue(10000);
        order.setPayment_method(SplitterOrder.PaymentMethod.CC);
        orders.add(order);

        order = new SplitterOrder();
        order.setId("1002");
        order.setValue(20000);
        order.setPayment_method(SplitterOrder.PaymentMethod.COD);
        orders.add(order);

        order = new SplitterOrder();
        order.setId("1003");
        order.setValue(30000);
        order.setPayment_method(SplitterOrder.PaymentMethod.COUPON);
        orders.add(order);

        order = new SplitterOrder();
        order.setId("1004");
        order.setValue(40000);
        order.setPayment_method(SplitterOrder.PaymentMethod.CC);
        orders.add(order);

        order = new SplitterOrder();
        order.setId("1005");
        order.setValue(50000);
        order.setPayment_method(SplitterOrder.PaymentMethod.COD);
        orders.add(order);

        for (Object ord : orders)
            System.out.println("Added order " + ord.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        return orders;
    }
}

