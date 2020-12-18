import java.util.*;

public class Main {
    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("D", "J SW-234");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be
        // added to the list again

        VehicleRegistry registry = new VehicleRegistry();
        registry.add(li1, "Arto");
        registry.add(li2, "Arto");
        registry.add(li3, "Jurgen");
        System.out.println("License Plates");
        registry.printLicensePlates();
        System.out.println("owners:");
        registry.printOwners();
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }

}
