package observer.observer;

import observer.WeatherForecast;

public class TvNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Tv - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni Celcjusza. Ciśnienie atmosferyczne" + weatherForecast.getPressure() + " hPa");

    }
}
