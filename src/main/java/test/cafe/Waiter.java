package test.cafe;

import java.util.List;

public class Waiter {
    public Delivery prepareDelivery(List<Drink> drinks) {
        return new Delivery(drinks);
    }
}
