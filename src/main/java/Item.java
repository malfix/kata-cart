public class Item {
    private final Discount discount;

    public Item(Discount discount) {
        this.discount = discount;
    }

    protected int getPriceFor(int qta) {
        int priceTot = getDiscountedPrice(qta / discount.getQta());
        return priceTot + qta % discount.getQta() * discount.getBasePrice();
    }

    private int getDiscountedPrice(int groupQta) {
        return discount.getDiscountedPrice() * groupQta;
    }

}
