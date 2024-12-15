/*
* David Cortinez
* Module 8 Lab 2
* Purpose: * implement the code for the HighTraffic and MediumTraffic classes and add to driver
*
* *** Outline ***

MediumTraffic Class:



// Represents a medium traffic condition. Implements TrafficState for medium
// travel conditions.
// Your multiplier for the distance is 3
//Your message for the user in the getDirection is to
// suggests using a mix of main roads and side streets.
HighTraffic Class



// Represents a high traffic condition. Implements TrafficState for slow
// travel conditions.
// Your multiplier for the distance is 5
// Your message for the user in the getDirection is to
// suggests using side streets to avoid heavy traffic on main roads.
// TODO - Create the HighTraffic Class
Driver:



Modify the Switch conditions 3, and 4 (the TODO sections) to accommodate the new
states you have created
 */

public class DirectionService {
    private TrafficState currentState; // Current state of the traffic.
    private int distance; // Current distance for the trip.
    // Constructor to initialize the service with a specific traffic state and distance.
    public DirectionService(TrafficState state, int distance) {
        this.currentState = state;
        this.distance = distance;
    }
    // Sets the current traffic state, allowing the behavior of getETA and getDirection to change dynamically.
    public void setTrafficState(TrafficState state) {
        this.currentState = state;
    }
    // Returns the current traffic state, allowing external classes to get information about the current state.
    public TrafficState getCurrentState() {
        return currentState;
    }
    // Delegates the calculation of ETA to the current state.
    public int getETA() {
        return currentState.getETA(distance);
    }
    // Delegates the provision of directions to the current state.
    public String getDirection() {
        return currentState.getDirection(distance);
    }
    // Optionally, a method to update the distance if needed.
    public void setDistance(int distance) {
        this.distance = distance;
    }
}