package nivel2.products;

public class SpainAddress implements Address {
    private final String street;
    private final String city;

    public SpainAddress(String street, String city) {
        if (street == null || street.trim().isEmpty()) {
            throw new IllegalArgumentException("Street cannot be null or empty");
        }
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }

        this.street = street.trim();
        this.city = city.trim();
    }

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", Spain";
    }
}
