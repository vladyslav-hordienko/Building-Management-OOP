// Academic project by Vladyslav Hordiienko
package griffith;
//in this class creating lists of residential and commercial buildings, print info and Eircode search
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class BuildingsTest {

    public static void main(String[] args) {
        List<ResidentialBuilding> residentials = new ArrayList<>();

        List<CommercialBuilding> commercials = new ArrayList<>();

        //  example of  addresses
        Address a1 = new Address(new Location(53.330934891, -3.34361785), "D08WM13", "Griffith College Road ", "Dublin");
        Address a2 = new Address(new Location(53.342343435, -6.55353455), "D02FG39", "South Circular ROad ", "Dublin");
        Address a3 = new Address(new Location(53.534903435, -8.23566534), "D04KC15", " Center Road ", "Dublin");
        Address a4 = new Address(new Location(53.9949585955, -7.94593455), "D19HG56", " King of Ireland Street(Grafton)", "Dublin");

        // create buildings
        residentials.add(new ResidentialBuilding("Griffith A1", "194 ", a1));
        residentials.add(new ResidentialBuilding("UCD B2", "123 ", a2));




        commercials.add(new CommercialBuilding("SuperDuper shop", "12am-10pm", a3));
        commercials.add(new CommercialBuilding("MegaSales wow", a4));




        // print info
           System.out.println("    Residential Buildings    ");
         for (ResidentialBuilding r : residentials) {
               System.out.println(r.getInfo());
        }

        System.out.println("   Commercial Buildings    ");
        for (CommercialBuilding c : commercials) {
                 System.out.println(c.getInfo());
          }




        // search by Eircode
           Scanner scan = new Scanner(System.in);
         System.out.println("Enter Eircode:");
              String search = scan.nextLine();
              boolean found = false;


//using linear search for both lists
         for (ResidentialBuilding r : residentials) {
              if (r.getAddress().getEircode().equalsIgnoreCase(search)) {
                   System.out.println("Found Residential: " + r.getInfo());
                found = true;
            }
        }
        for (CommercialBuilding c : commercials) {
                 if (c.getAddress().getEircode().equalsIgnoreCase(search)) {
                System.out.println("Found Commercial: " + c.getInfo());
                found = true;
              }
        }
        //if not found - message shown
          if (!found) System.out.println("No matches found");
    }
}
