package observerPattern.observer;

import observerPattern.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
