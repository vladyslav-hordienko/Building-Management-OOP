// Academic project by Vladyslav Hordiienko
package griffith;

//class representing  commercial building with optional opening hours, while extending building class  to reuse name and the address

//attributes
public class CommercialBuilding extends Building {
    private String openingHours;

    //constructor
    public CommercialBuilding(String name, String openingHours, Address buildingAddress) {
        super(name, buildingAddress);
        this.openingHours = openingHours;
    }

    //constructor if there is no opening time
    public CommercialBuilding(String name, Address buildingAddress) {
        super(name, buildingAddress);
        this.openingHours = null;
    }

    public String getOpeningHours() {
        return openingHours;
    }
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Override //shows that getInfo adds opening hours on top of the info from building class
    public String getInfo() {
        return super.getInfo() + ", Opening Hours: " + openingHours;
    }
}
