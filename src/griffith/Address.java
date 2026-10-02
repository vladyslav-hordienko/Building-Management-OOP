// Academic project by Vladyslav Hordiienko
package griffith;
//  store address info with location by using inhertence from location class, eircode, street and city, also give full address as one string.


//attributes
public class Address {
    private Location location;
    private String eircode;
    private String street;
    private String city;

    //constructor
    public Address(Location location, String eircode, String street, String city) {
        this.location = location;
        this.eircode = eircode;
        this.street = street;
        this.city = city;
    }

    //Setters/Getters

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEircode() {
        return eircode;
    }
    public void setEircode(String eircode) {
        this.eircode = eircode;
    }



    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }



    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


//method getFullAddress that returns eircode, street and city as one string
    public String getFullAddress() {
        return eircode + " , " + street +   " , " + city;
    }
}
