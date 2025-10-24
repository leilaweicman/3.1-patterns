package nivel2.products;

public class USAAddress implements Address {
    private final String street;
    private final String city;

    public USAAddress(String street, String city) {
        if (street == null || street.isEmpty() || city == null || city.isEmpty()) {
            throw new IllegalArgumentException("Street and city cannot be empty");
        }

        this.street = street.trim();
        this.city = city.trim();
    }

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", USA";
    }
}
