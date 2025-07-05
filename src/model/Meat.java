package model;
import java.math.BigDecimal;

public class Meat extends Food implements Discountable {
    public Meat(int amount, BigDecimal price) {
        super(amount, price,false);
    }

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }
}
