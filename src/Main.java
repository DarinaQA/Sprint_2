import model.Apple;
import model.Meat;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, new BigDecimal("100"));
        Apple redApple = new Apple(10, new BigDecimal("50"), Colour.RED);
        Apple greenApple = new Apple(8, new BigDecimal("60"), Colour.GREEN);
        Food[] products = new Food[] { meat, redApple, greenApple };
        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма без скидки: %.2f%n", cart.getTotalPriceWithoutDiscount());
        System.out.printf("Общая сумма со скидкой: %.2f%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f%n", cart.getVegetarianTotalWithoutDiscount());
    }
}
