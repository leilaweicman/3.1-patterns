package nivel2;

import nivel2.products.Address;
import nivel2.products.PhoneNumber;

public class Contact {

    private final String name;
    private final Address address;
    private final PhoneNumber phoneNumber;

    public Contact(String name, Address address, PhoneNumber phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return "Name: " + name + "\nAddress: " + address.getFullAddress() + "\nPhone: " + phoneNumber.getFullNumber();
    }
}
