package arrayLists.exercises;

public class MobilePhoneDemo {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("8569361");
        Contact contact1 = new Contact("Bob", "31415926");
        myPhone.addNewContact(contact1);
        myPhone.addNewContact(Contact.createContact("Alan", "458931"));
        Contact alice1 = Contact.createContact("Alice", "16180339");
        myPhone.addNewContact(alice1);
        myPhone.addNewContact(Contact.createContact("Alice", "16180339"));
        myPhone.addNewContact(Contact.createContact("Tom", "11235813"));
        myPhone.addNewContact(Contact.createContact("Jane", "23571113"));
        myPhone.removeContact(contact1);

        myPhone.printContacts();
        System.exit(0);


        System.out.println(myPhone.queryContact("Alan"));


    }
}
