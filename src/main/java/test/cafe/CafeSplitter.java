package test.cafe;

import java.util.List;

public class CafeSplitter {
    public List<OrderItem> split(Order order) {
        return order.getItems();
    }
}
