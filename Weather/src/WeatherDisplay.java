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

// Concrete Observers
class WeatherDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Weather Display: Temperature changed to " + temperature);
        // Perform specific behavior based on temperature update
    }
}