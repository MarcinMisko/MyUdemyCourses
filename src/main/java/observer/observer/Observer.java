package observer.observer;

import observer.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
