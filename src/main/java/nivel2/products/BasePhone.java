package nivel2.products;

public abstract class BasePhone implements PhoneNumber {
    private final String countryCode;
    private final String number;

    protected BasePhone(String countryCode, String number) {
        if (countryCode == null || countryCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Country code cannot be null or empty");
        }
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty");
        }

        String clean = normalizeCommon(number);
        System.out.println("clean" + clean);
        clean = normalizeCountrySpecific(clean);

        this.countryCode = countryCode;
        this.number = clean;
    }

    private String normalizeCommon(String input) {
        return input.trim().replaceAll("\\s+", "");
    }

    protected abstract String normalizeCountrySpecific(String clean);

    protected String getCountryCode() {
        return countryCode;
    }

    protected String getNumber() {
        return number;
    }
}