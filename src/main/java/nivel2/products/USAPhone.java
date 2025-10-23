package nivel2.products;

public class USAPhone implements PhoneNumber {
    private static final String COUNTRY_CODE = "+1";
    private final String number;

    public USAPhone(String number) {
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty");
        }
        this.number = number.trim();
    }

    @Override
    public String getFullNumber() {
        return COUNTRY_CODE + " " + number;
    }
}
