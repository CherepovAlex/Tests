package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;
import static io.hexlet.Module2.JavaAutomaticTest.Carts.makeCart;
import static org.junit.jupiter.api.Assertions.*;

public class Test8CartTest {
    // BEGIN (write your solution here)
    @Test
    public void testMakeCart() {
        var cart = Carts.makeCart();
        assertNotNull(cart);
    }

    @Test
    public void testAddItem() {
        var cart = Carts.makeCart();
        var car = new Good("car", 3);
        var house = new Good("house", 10);

        cart.addItem(car, 5);
        cart.addItem(house, 2);

        assertEquals(2, cart.getItems().size());
        assertEquals(35, cart.getCost());
        assertEquals(7, cart.getCount());
    }
    // END
    public static void main(String[] args) {
        var cart = makeCart();

        // Создаём новые товары
        var car = new Good("car", 3);
        var house = new Good("house", 10);

        // Добавляем их в корзину
        cart.addItem(car, 5);
        cart.addItem(house, 2);

        cart.getItems().size(); // 2
        cart.getCost(); // 35
        cart.getCount(); // 7
    }

}
