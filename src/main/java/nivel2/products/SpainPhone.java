package nivel2.products;

public class SpainPhone implements PhoneNumber {
    private static final String COUNTRY_CODE = "+34";
    private final String number;

    public SpainPhone(String number) {
        this.number = number;
    }

    @Override
    public String getFullNumber() {
        return COUNTRY_CODE + " " + number;
    }
}
