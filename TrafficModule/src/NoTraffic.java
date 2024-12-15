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

public class NoTraffic implements TrafficState {
    @Override
    public int getETA(int distance) {
        // In no traffic, every mile might take approximately 1 minute to cover.
        return distance; // Since 1 mile per minute, the ETA is equal to the distance.
    }
    @Override
    public String getDirection(int distance) {
        // Provides a generic direction for traveling without any traffic delays.
        return "Proceed straight to your destination, roads are clear.";
    }
}
