/**
 * Created by emalfara on 25/01/16.
 */
public class NoDiscount extends Discount {
    public NoDiscount(int defaultPrice) {
        super(defaultPrice, 1, defaultPrice);
    }
}
