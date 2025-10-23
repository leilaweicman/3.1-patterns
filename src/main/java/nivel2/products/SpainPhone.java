package nivel2.products;

public class SpainPhone implements PhoneNumber {
    private static final String COUNTRY_CODE = "+34";
    private final String number;

    public SpainPhone(String number) {
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
