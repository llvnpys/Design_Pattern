package behavioral.observer;

public interface Observer {
    WeatherData weatherData = WeatherData.getInstance();
    void update();
}
