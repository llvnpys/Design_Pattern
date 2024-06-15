package behavioral.observer;

public class Display1 implements Observer{
    private int temp;
    private int humidity;

    @Override
    public void update() {
        temp = weatherData.getTemp();
        humidity = weatherData.getHumidity();

        display();
    }
    public void display(){
        System.out.println("Display 1 : 데이터가 갱신되었습니다.");
        System.out.println("온도 : " + temp + " 습도 : " + humidity);
    }

}
