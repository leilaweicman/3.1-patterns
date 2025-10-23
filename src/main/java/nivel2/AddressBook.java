package nivel2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<Contact> contacts = new ArrayList<>();

    void addContact(Contact contact) {
        contacts.add(contact);
    }

    public String getAllContactsInfo() {
        if (contacts.isEmpty()) return "No contacts in address book.";

        StringBuilder result = new StringBuilder("\nAddress Book:\n");

        for (Contact contact : contacts) {
            result.append("\n").append(contact.getInfo()).append("\n");
        }

        return result.toString();
    }
}
