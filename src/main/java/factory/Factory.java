package factory;

import factory.vehicles.BMWModelType;
import factory.vehicles.Car;
import factory.vehicles.FordModelType;

public interface Factory {
    Car createBMW(BMWModelType bmwModelType);
    Car createFord(FordModelType fordModelType);
}
