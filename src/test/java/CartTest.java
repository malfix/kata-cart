import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void price() {
        Cart cart = new Cart(setup());

        assertEquals(0, cart.price(""));
        assertEquals(50, cart.price("A"));
        assertEquals(80, cart.price("AB"));
        assertEquals(115, cart.price("CDBA"));
        assertEquals(100, cart.price("AA"));
        assertEquals(130, cart.price("AAA"));
        assertEquals(175, cart.price("AAABB"));
    }

    private HashMap<String, Item> setup() {
        HashMap<String, Item> unitHashMap = new HashMap<String, Item>();
        unitHashMap.put("A", new Item(new Discount(50, 3,130)));
        unitHashMap.put("B", new Item(new Discount(30, 2, 45)));
        unitHashMap.put("C", new Item(new NoDiscount(20)));
        unitHashMap.put("D", new Item(new NoDiscount(15)));
        return unitHashMap;
    }
}
