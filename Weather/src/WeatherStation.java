/*
* David Cortinez
* Module 8 Lab 3
* Purpose:  Your task is to extend the system by implementing an additional observer: a WeatherLogger that logs temperature updates to a file.
*
* *** Outline ***
* Implement a WeatherLogger class that implements the Observer interface to receive temperature updates from the weather station.

The WeatherLogger class should include a method logTemperature(float temperature) that logs the temperature to a file. You can use simple console output for logging in this lab.

Register the WeatherLogger as an observer with the WeatherStation in the Main class.

Test your implementation by simulating temperature changes using the WeatherStation. Verify that the WeatherLogger receives temperature updates and logs them correctly.
 */

import java.util.List;
import java.util.ArrayList;
// Subject (Observable)
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}