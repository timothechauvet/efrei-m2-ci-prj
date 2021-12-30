package test.splitter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SplitterOrder {
    public enum PaymentMethod {
        CC, COD, COUPON // CC = credit card, COD = cash on delivery
    }

    private String id;
    private int value;
    private PaymentMethod payment_method;
}
