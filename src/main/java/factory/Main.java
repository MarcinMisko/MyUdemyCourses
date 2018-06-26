package factory;

import factory.vehicles.BMWModelType;
import factory.vehicles.Car;
import factory.vehicles.FordModelType;

public class Main {
    public static void main(String[] args) {
        CommonwealthFactory commonwealthFactory = new CommonwealthFactory();
        ContinentalFactory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.createBMW(BMWModelType.E60);
        System.out.println(bmw.getSide());

        Car ford = continentalFactory.createFord(FordModelType.CMAX);
        System.out.println(ford.getSide());
    }
}
