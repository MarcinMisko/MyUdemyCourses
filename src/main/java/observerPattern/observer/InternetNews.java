package observerPattern.observer;

import observerPattern.WeatherForecast;

public class InternetNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni Celcjusza. Ciśnienie atmosferyczne" + weatherForecast.getPressure() + " hPa");

    }
}
