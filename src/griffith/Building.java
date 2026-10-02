// Academic project by Vladyslav Hordiienko
package griffith;

//  storing  a building’s name and address with inheritence from address class  and can give all info as a string

//attributes
public class Building {
    private String name;
    private Address address;

    //constructor
    public Building(String name, Address address) {
        this.name = name;
        this.address = address;
    }

       //getters/setters

            public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    //method getInfo that returns information about the building as a string. Usng metthod getFullAddress from ()address method
    public String getInfo() {
        return "Name: " + name + ", Address: " + address.getFullAddress();
    }
}
