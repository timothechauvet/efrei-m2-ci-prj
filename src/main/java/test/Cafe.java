package test;

import org.springframework.integration.annotation.Gateway;

public class Cafe {
        @Gateway(requestChannel="orders")
        public void placeOrder(Order order){
                Barista barista = new Barista();
                order.orderItems.stream().forEach(
                        (item) -> {
                                if ((item.iced)) {
                                        barista.prepareColdDrink(item);
                                } else {
                                        barista.prepareHotDrink(item);
                                }
                        }
                );
                        //        return ((this.iced) ? "iced " : "hot ") + this.shots + " shot " + this.type;
                //for all orderitem in list if cold prepare cold, if hot prepare hot
        };
}
