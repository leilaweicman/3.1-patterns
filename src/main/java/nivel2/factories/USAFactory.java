package nivel2.factories;

import nivel2.products.*;

public class USAFactory implements ContactFactory{
    @Override
    public Address createAddress(String street, String city) {
        return new USAAddress(street, city);
    }

    @Override
    public PhoneNumber createPhone(String number) {
        return new USAPhone(number);
    }
}
