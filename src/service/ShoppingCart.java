package service;
import model.Food;
import model.Discountable;
import java.math.BigDecimal;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public BigDecimal getTotalPriceWithoutDiscount() {
        BigDecimal total = BigDecimal.ZERO;
        for (Food product : products) {
            BigDecimal amount = BigDecimal.valueOf(product.getAmount());
            total = total.add(product.getPrice().multiply(amount));
        }
        return total;
    }

    public BigDecimal getTotalPriceWithDiscount() {
        BigDecimal total = BigDecimal.ZERO;
        for (Food product : products) {
            BigDecimal discount = ((Discountable) product).getDiscount();
            BigDecimal amount = BigDecimal.valueOf(product.getAmount());
            BigDecimal price = product.getPrice().multiply(BigDecimal.ONE.subtract(discount));
            total = total.add(price.multiply(amount));
        }
        return total;
    }

    public BigDecimal getVegetarianTotalWithoutDiscount() {
        BigDecimal total = BigDecimal.ZERO;
        for (Food product : products) {
            if (product.isVegetarian()) {
                BigDecimal amount = BigDecimal.valueOf(product.getAmount());
                total = total.add(product.getPrice().multiply(amount));
            }
        }
        return total;
    }
}