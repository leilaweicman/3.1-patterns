package nivel2.products;

public class USAPhone implements PhoneNumber {
    private static final String COUNTRY_CODE = "+1";
    private final String number;

    public USAPhone(String countryCode, String number) {
        this.number = number;
    }

    @Override
    public String getFullNumber() {
        return COUNTRY_CODE + " " + number;
    }
}
