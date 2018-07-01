package decorator;

public class PotatoMeal extends Meal {

    public PotatoMeal() {
    }

    @Override
    public void prepareMeal() {
        System.out.println("I'm preparing a potato-based dish");

    }
}
