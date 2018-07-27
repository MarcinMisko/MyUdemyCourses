package strategy.pricingstrategy;

public class RegularPrice implements PricingStrategy {

    RegularPrice regularPrice;

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("Regular price: " + price);
        } else {
            System.out.println("The user subscribed to the newsletter, choose a different pricing strategy!");
        }

    }
}
