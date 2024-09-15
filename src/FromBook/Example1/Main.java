package FromBook.Example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = generateRandomContacts();

        ContactService contactService = new ContactService();

        List<Contact> matchedContacts = contactService.findContacts(contacts,
                                                                    contact -> 18 <= contact.getAge() && contact.getAge() <= 25);
        System.out.println(matchedContacts.size());

        List<Contact> matchedContactsFemale = contactService.findContacts(contacts,
                                                                          contact -> (18 <= contact.getAge() && contact.getAge() <= 25)
                                                                                  && contact.getGender().equals(Contact.Gender.FEMALE));
        System.out.println(matchedContactsFemale.size());
    }

    /* Full form. Short form is above.
    * List<Contact> matchedContacts = contactService.findContacts(contacts, new FilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                return 18 <= contact.getAge() && contact.getAge() <= 25;
            }
        });
     */

    public static List<Contact> generateRandomContacts() {
        List<Contact> contacts = new ArrayList<>();
        String[] names = {"John Doe", "Jane Smith", "Robert Johnson", "Emily Davis", "Michael Brown"};
        String[] emails = {"john@example.com", "jane@example.com", "robert@example.com", "emily@example.com", "michael@example.com"};
        Random random = new Random();

        for (int i = 0; i < names.length; i++) {
            String name = names[random.nextInt(names.length)];
            String email = emails[random.nextInt(emails.length)];
            int age = 16 + random.nextInt(8); // Random age between 18 and 60
            Contact.Gender gender = Contact.Gender.values()[random.nextInt(Contact.Gender.values().length)];
            contacts.add(new Contact(name, email, age, gender));
        }

        return contacts;
    }
}
