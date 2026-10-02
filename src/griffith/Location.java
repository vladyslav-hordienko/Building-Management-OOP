// Academic project by Vladyslav Hordiienko
package griffith;
//  class stores latitude and longitude for a location and gives access to them with getteres and setters.


//attributes
public class Location {
    private double latitude;
    private double longitude;

    //constructor
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //setters/getters
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
