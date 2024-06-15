package behavioral.observer;

public class Display2 implements Observer{

    private int humidity;
    private int pressure;
    @Override
    public void update() {
        pressure = weatherData.getPressure();
        humidity = weatherData.getHumidity();

        display();
    }

    public void display(){
        System.out.println("Display 2 데이터가 갱신되었습니다.");
        System.out.println("기압 : " + pressure + " 습도 : " + humidity);
    }
}
