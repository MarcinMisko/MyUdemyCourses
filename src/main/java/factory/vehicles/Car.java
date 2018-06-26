package factory.vehicles;

public abstract class Car {
    private final int capacity;
    private final String fuelType;
    private final int madeYear;
    private final WheelSide side;

    protected Car(int capacity, String fuelType, int madeYear, WheelSide side) {
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.madeYear = madeYear;
        this.side = side;
    }


    public WheelSide getSide() {
        return side;
    }
}
