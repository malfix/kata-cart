import java.util.HashMap;

public class Cart {

    HashMap<String, Item> priceAndDiscounts;
    HashMap<String, Integer> cart;

    public Cart(HashMap<String, Item> priceAndDiscounts) {
        this.priceAndDiscounts = priceAndDiscounts;
        resetCart();
    }

    public int price(String s) {
        buildCart(s);

        int total = 0;
        for (String unit : cart.keySet()) {
            total += priceAndDiscounts.get(unit).getPriceFor(cart.get(unit));
        }
        return total;
    }

    private void resetCart() {
        cart = new HashMap<String, Integer>();
    }

    private void buildCart(String s) {
        resetCart();
        for (String unit : s.split("")) {
            if (priceAndDiscounts.get(unit) != null) {
                cart.put(unit, getUpdatedQta(unit));
            }
        }
    }

    private Integer getUpdatedQta(String unit) {
        Integer qta = cart.get(unit);
        if (qta == null)
            qta = 1;
        else
            qta = qta + 1;
        return qta;
    }
}
