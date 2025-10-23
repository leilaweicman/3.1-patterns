package nivel2.factories;

import nivel2.products.Address;
import nivel2.products.PhoneNumber;
import nivel2.products.SpainAddress;
import nivel2.products.SpainPhone;

public class SpainFactory implements ContactFactory{
    @Override
    public Address createAddress(String street, String city) {
        return new SpainAddress(street, city);
    }

    @Override
    public PhoneNumber createPhone(String number) {
        return new SpainPhone(number);
    }
}
