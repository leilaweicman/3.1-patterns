package nivel2.products;

public class USAAddress implements Address {
    private final String street;
    private final String city;

    public USAAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", USA";
    }
}
