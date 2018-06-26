package factory;

import factory.vehicles.*;

public class CommonwealthFactory implements Factory {
    WheelSide side = WheelSide.RIGHTSIDE;

    @Override
    public Car createBMW(BMWModelType bmwModelType) {
        switch (bmwModelType) {
            case E60:
                return new BMW(4500, "Gas", 2002, side);
            case X5:
                return new BMW(1240, "Water", 2015, side);
            default:
                throw new IllegalArgumentException("No such vehicle model in this factory");
        }
    }

    @Override
    public Car createFord(FordModelType fordModelType) {
        switch (fordModelType) {
            case CMAX:
                return new Ford(1500, "Oil", 2000, side);
            case FOCUS:
                return new Ford(2400, "Hybrid", 2010, side);
            default:
                throw new IllegalArgumentException("No such vehicle model in this factory");
        }
    }
}
