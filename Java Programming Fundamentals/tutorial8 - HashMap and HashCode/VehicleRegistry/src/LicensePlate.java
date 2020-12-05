
public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    // ACCESSOR
    public String getLicenseNumber() {return this.liNumber;}
    public String getCountry() {return this.country;}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LicensePlate)) return false;
        LicensePlate comparedObj = (LicensePlate) obj;
        if (this.liNumber.equals(comparedObj.liNumber) && this.country.equals(comparedObj.country)) return true;
        return false;
    }
    @Override
    // This will serve as our **key** in hashmap in vehicle registry already
    // has direct effect on keySet() method of HashMap
    // we can use license plate directly
    public int hashCode() {
        if (this.liNumber == null) {
            return this.country.hashCode();
        }
        return this.country.hashCode() + this.liNumber.hashCode();

    }

    @Override
    public String toString() {
        return this.country + " " + liNumber;
    }
    
}
