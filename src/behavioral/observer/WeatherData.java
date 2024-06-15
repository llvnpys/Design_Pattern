package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Sebject{
    private List<Observer> observers = new ArrayList<>();
    private int temp;
    private int humidity;
    private int pressure;

    private static WeatherData instance;

    public static WeatherData getInstance() {
        if(instance == null){
            instance = new WeatherData();
        }
        return instance;
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setMeasurements(int temp, int humidity, int pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
