package decorator;

public class RiceMeal extends Meal {

    public RiceMeal() {
    }

    @Override
    public void prepareMeal() {
        System.out.println("I'm preparing a rice-based dish");
    }
}
