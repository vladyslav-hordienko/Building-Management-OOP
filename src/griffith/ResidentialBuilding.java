// Academic project by Vladyslav Hordiienko
package griffith;
// the actuall  class extends Building class  to also add a building number for residential buildings.


//attributes
public class ResidentialBuilding extends Building {

    private String buildingNumber;

//constructor
    public ResidentialBuilding(String name, String buildingNumber, Address address) {
        super(name, address);

        this.buildingNumber = buildingNumber;
    }

    //constructor if ther is no name
    public ResidentialBuilding(String buildingNumber, Address address) {
        super("", address);
        this.buildingNumber = buildingNumber;
    }

    // Getter/Setter
    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }



    @Override // overriding getInfo from Building to add residential-specific info
    public String getInfo() {
        return "Residential Building Number: " + buildingNumber + super.getInfo(); // добавляем info из Building
    }
}
