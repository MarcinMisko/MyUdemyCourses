package strategy;

import strategy.pricingstrategy.PricingStrategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    void calculate(int price, boolean isSignedUpForNewsletter) {
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
