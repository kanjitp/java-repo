import java.util.*;

public class VehicleRegistry {
    HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        } else {
            registry.put(licensePlate, owner);
            return true;
        }
    }
    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
        
    }
    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.registry.keySet()) {
            System.out.println(licensePlate + " (" + registry.get(licensePlate) +")");
        }
    }
    public void printOwners() { // print each owner ownly once
        ArrayList<String> printedNames = new ArrayList<>();
        for (LicensePlate licensePlate : this.registry.keySet()) {
            if (!printedNames.contains(registry.get(licensePlate))) {
                System.out.println(registry.get(licensePlate));
                printedNames.add(registry.get(licensePlate));
            }
        }
    }
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }


    
}
