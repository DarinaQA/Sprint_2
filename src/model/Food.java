package model;
import java.math.BigDecimal;

public abstract class Food implements Discountable {
    protected int amount;
    protected BigDecimal price;
    protected boolean isVegetarian;

    protected Food(int amount, BigDecimal price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }
}