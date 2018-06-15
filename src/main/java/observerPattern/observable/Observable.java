package observerPattern.observable;

import observerPattern.observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
