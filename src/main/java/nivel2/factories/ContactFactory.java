package nivel2.factories;

import nivel2.products.Address;
import nivel2.products.PhoneNumber;

public interface ContactFactory {
    Address createAddress(String street, String city);
    PhoneNumber createPhone(String number);
}
