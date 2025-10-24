package nivel2.products;

public class USAPhone extends BasePhone {

    private static final String NUMBER_COUNTRY_CODE = "1";
    private static final String COUNTRY_CODE = "+" + NUMBER_COUNTRY_CODE;

    public USAPhone(String number) {
        super(COUNTRY_CODE, number);
    }

    @Override
    protected String normalizeCountrySpecific(String input) {
        if (input.startsWith(COUNTRY_CODE)) input = input.substring(2);
        if (input.startsWith(NUMBER_COUNTRY_CODE)) input = input.substring(1);
        if (!input.matches("\\d{10}")) {
            throw new IllegalArgumentException("U.S. phone number must have 10 digits");
        }
        return input;
    }

    @Override
    public String getFullNumber() {
        String n = getNumber();
        return getCountryCode() + " (" + n.substring(0, 3) + ") " + n.substring(3, 6) + "-" + n.substring(6);
    }
}
