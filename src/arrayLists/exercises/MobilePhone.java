package arrayLists.exercises;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1){
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) == -1) {
            return false;
        } else {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) == -1) {
            return false;
        } else {
            myContacts.remove(contact);
            return true;
        }
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int contactIndex = findContact(name);
        if (contactIndex == -1) {
            return null;
        } else {
            return myContacts.get(contactIndex);
        }
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.printf("%d. %s -> %s", (i + 1), contact.getName(), contact.getPhoneNumber());
        }
    }
}
