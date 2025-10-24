package nivel2;

import nivel2.factories.ContactFactory;
import nivel2.factories.SpainFactory;
import nivel2.factories.USAFactory;

public class Main {
    public static void main(String[] args) {

        ContactFactory spainFactory = new SpainFactory();
        Contact spainContact = new Contact("Pedro",
                spainFactory.createAddress("Calle Mayor 10", "Madrid"),
                spainFactory.createPhone("+34600123456")
        );

        ContactFactory USAFactory = new USAFactory();
        Contact USAContact = new Contact("Jhon",
                USAFactory.createAddress("742 Evergreen Terrace", "Springfield"),
                USAFactory.createPhone("2025550100")
        );

        AddressBook addressBook = new AddressBook();
        addressBook.addContact(spainContact);
        addressBook.addContact(USAContact);

        System.out.println(addressBook.getAllContactsInfo());
    }
}
