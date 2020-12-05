import java.util.*;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storagefacility;

    public StorageFacility() {
        this.storagefacility = new HashMap<>();
    }
    public void add(String storageUnit, String item) {
        this.storagefacility.putIfAbsent(storageUnit, new ArrayList<>());
        this.storagefacility.get(storageUnit).add(item);
    }
    public void remove(String storageUnit, String item) {
        if (this.storagefacility.containsKey(storageUnit)) {
            this.storagefacility.get(storageUnit).remove(item);
            if (this.storagefacility.get(storageUnit).isEmpty()) {
                this.storagefacility.remove(storageUnit);
            }
        }
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String storageUnit : storagefacility.keySet()) {
            storageUnits.add(storageUnit);
        }
        return storageUnits;
    }
    public ArrayList<String> contents(String storageUnit) {
        if (storagefacility.containsKey(storageUnit)) {
            return this.storagefacility.get(storageUnit);
        }
        return new ArrayList<String>();
    }
    
}
