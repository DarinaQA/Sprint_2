package model;
import model.constants.Colour;
import model.constants.Discount;
import java.math.BigDecimal;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, BigDecimal price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public BigDecimal getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.DISCOUNT_FOR_RED_APPLE.divide(new BigDecimal("100"));
        } else {
            return BigDecimal.ZERO;
        }
    }
}