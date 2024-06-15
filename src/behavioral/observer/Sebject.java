package behavioral.observer;

import java.util.List;

public interface Sebject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
