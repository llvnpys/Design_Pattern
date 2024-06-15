package behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = WeatherData.getInstance();
        Observer[] observers = new Observer[3];
        observers[0] = new Display1();
        observers[1] = new Display2();
        observers[2] = new Display3();

        for (int i = 0; i < 3; i++) {
            weatherData.registerObserver(observers[i]);
        }

        weatherData.setMeasurements(10, 20, 30);
        weatherData.removeObserver(observers[1]);
        weatherData.setMeasurements(20, 30, 40);
    }
}
