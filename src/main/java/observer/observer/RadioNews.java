package observer.observer;

import observer.WeatherForecast;

public class RadioNews implements Observer{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature()
                + " stopni Celcjusza. Ciśnienie atmosferyczne" + weatherForecast.getPressure() + " hPa");
    }
}
