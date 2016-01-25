public class Discount {
    private int basePrice;
    private int qta;
    private int discountedPrice;

    public Discount(int basePrice, int qta, int discountedPrice) {
        this.basePrice = basePrice;
        this.qta = qta;
        this.discountedPrice = discountedPrice;
    }

    public int getQta() {
        return qta;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }
}
