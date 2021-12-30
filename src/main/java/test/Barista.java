package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class Barista {

    private static Log logger = LogFactory.getLog(Barista.class);

    private long hotDrinkDelay = 5000;

    private long coldDrinkDelay = 1000;

    private static final AtomicInteger hotDrinkCounter = new AtomicInteger();

    private static final AtomicInteger coldDrinkCounter = new AtomicInteger();


    public void setHotDrinkDelay(long hotDrinkDelay) {
        this.hotDrinkDelay = hotDrinkDelay;
    }

    public void setColdDrinkDelay(long coldDrinkDelay) {
        this.coldDrinkDelay = coldDrinkDelay;
    }

    public Drink prepareHotDrink(OrderItem orderItem) {
        try {
            Thread.sleep(this.hotDrinkDelay);
            logger.info(Thread.currentThread().getName()
                    + " prepared hot drink #" + hotDrinkCounter.incrementAndGet() + " for order #"
                    + orderItem.getOrderNumber() + ": " + orderItem);
            return new Drink(orderItem.getOrderNumber(), orderItem.getDrinkType(), orderItem.isIced(),
                    orderItem.getShots());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public Drink prepareColdDrink(OrderItem orderItem) {
        try {
            Thread.sleep(this.coldDrinkDelay);
            logger.info(Thread.currentThread().getName()
                    + " prepared cold drink #" + coldDrinkCounter.incrementAndGet() + " for order #"
                    + orderItem.getOrderNumber() + ": " + orderItem);
            return new Drink(orderItem.getOrderNumber(), orderItem.getDrinkType(), orderItem.isIced(),
                    orderItem.getShots());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

}
