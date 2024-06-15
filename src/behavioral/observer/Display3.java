package behavioral.observer;

public class Display3 implements Observer{
    private int temp;
    private int pressure;

    public void update() {
        pressure = weatherData.getPressure();
        temp = weatherData.getTemp();

        display();
    }

    public void display(){
        System.out.println("Display3 : 데이터가 갱신되었습니다.");
        System.out.println("기압 : " + pressure + " 온도 : " + temp);
    }
}
