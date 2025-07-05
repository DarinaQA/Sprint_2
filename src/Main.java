import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, new BigDecimal("100"));
        Apple redApple = new Apple(10, new BigDecimal("50"), "red");
        Apple greenApple = new Apple(8, new BigDecimal("60"), "green");
        Food[] products = new Food[] { meat, redApple, greenApple };
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount());
    }
}
