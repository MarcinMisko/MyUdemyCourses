package strategy.pricingstrategy;

public class SalePrice implements PricingStrategy {

    SalePrice salePrice;

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("Sale price: " + price / 2);
        } else {
            System.out.println("The user is not subscribed to the newsletter, please change pricing strategy!");
        }
    }
}
