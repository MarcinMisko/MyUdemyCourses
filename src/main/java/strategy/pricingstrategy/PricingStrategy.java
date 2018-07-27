package strategy.pricingstrategy;

public interface PricingStrategy {
    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
