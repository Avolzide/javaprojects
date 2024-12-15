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

public class ObserverPatternDriver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer weatherDisplay = new WeatherDisplay();
        Observer mobileApp = new MobileApp();
        Observer weatherLogger = new WeatherLogger();
        weatherStation.addObserver(weatherDisplay);
        weatherStation.addObserver(mobileApp);
        weatherStation.addObserver(weatherLogger);
        // Simulate temperature change
        weatherStation.setTemperature(25.0f);
        System.out.println();
        // Simulate temperature change again
        weatherStation.setTemperature(30.0f);
        System.out.println();
        // Unregister an observer
        weatherStation.setTemperature(33.0f);
        weatherStation.removeObserver(mobileApp);
        System.out.println();
        System.out.println("Now we have removed the Mobile App Observer");
        weatherStation.setTemperature(33.0f);
        System.out.println();
        weatherStation.setTemperature(40.0f);
        System.out.println();
    }
}