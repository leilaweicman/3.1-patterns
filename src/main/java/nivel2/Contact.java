package nivel2;

import nivel2.products.Address;
import nivel2.products.PhoneNumber;

public class Contact {

    private final String name;
    private final Address address;
    private final PhoneNumber phoneNumber;

    public Contact(String name, Address address, PhoneNumber phoneNumber) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        if (phoneNumber == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }

        this.name = name.trim();
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return "Name: " + name + "\nAddress: " + address.getFullAddress() + "\nPhone: " + phoneNumber.getFullNumber();
    }
}
