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

public class MediumTraffic implements TrafficState {
    // Represents a medium traffic condition. Implements TrafficState for medium
    // travel conditions.

    @Override
    public int getETA(int distance) {
        return distance * 3;
    }

    @Override
    public String getDirection(int distance) {
        return "Using main roads and side streets into directions";
    }
    // Your multiplier for the distance is 3
    //Your message for the user in the getDirection is to
    // suggests using a mix of main roads and side streets.
    // TODO - Create the MediumTraffic Class
}
