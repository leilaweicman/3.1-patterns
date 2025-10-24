package nivel2.products;

public class SpainPhone extends BasePhone {
    private static final String NUMBER_COUNTRY_CODE = "34";
    private static final String COUNTRY_CODE = "+" + NUMBER_COUNTRY_CODE;

    public SpainPhone(String number) {
        super(COUNTRY_CODE, number);
    }

    @Override
    protected String normalizeCountrySpecific(String input) {
        if (input.startsWith(COUNTRY_CODE)) input = input.substring(3);
        if (input.startsWith(NUMBER_COUNTRY_CODE)) input = input.substring(2);
        if (!input.matches("\\d{9}")) {
            throw new IllegalArgumentException("Spanish phone number must have 9 digits");
        }
        return input;
    }

    @Override
    public String getFullNumber() {
        return getCountryCode() + " " + getNumber();
    }
}
