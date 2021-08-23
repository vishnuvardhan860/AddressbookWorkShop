package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class AddressBookTest {
    AddressBook addressBook;
    Contact contact = new Contact("VI", "VA", "Bengaluru", "Karnataka", 560099
            , 966339366, "VIVA123@gmail.com");
    Contact contact1 = new Contact("VI", "VI", "Bengaluru", "Karnataka", 560076
            , 526157122, "VIVI123@gmail.com");
    Contact newContact = new Contact("VG", "VG", "indore", "MP",
            21212, 6876786, "VGVG123@gmail.com");
    Contact newContact2 = new Contact("VJVJ", "VJ", "indore", "MP",
            21212, 6876786, "VJVJ123@gmail.com");

    @Test
    public void givenAddressbook_whenAdded_shouldReturnContactList() {
        addressBook = new AddressBook();
        addressBook.message();
        Contact contact = new Contact("VI", "VA", "Bengaluru", "Karnataka", 560099
                , 966339366, "VIVA123@gmail.com");
        Contact contact1 = new Contact("VI", "VI", "Bengaluru", "Karnataka", 560076
                , 526157122, "VIVI123@gmail.com");
        addressBook.addNewContact(contact);
        addressBook.addNewContact(contact1);
        ArrayList<Contact> contactList = addressBook.getContactlist();
        Assertions.assertEquals(2, contactList.size());
    }


    @Test
    public void givenContactsDataFromConsole_WhenAdded_shouldReturnTrue(){
        addressBook=new AddressBook();
        Assertions.assertTrue(addressBook.addNewContactFromConsole());
    }

    @Test
    public  void givenContactsData_whenAdded_shouldReturnTrue(){
        addressBook=new AddressBook();
        addressBook.addNewContact(contact);
        addressBook.addNewContact(contact1);
        Contact oldContact = addressBook.getContact("Gagan", "Sr");
        Contact oldContact2 = addressBook.getContact("gurasa", "Er");
        Assertions.assertEquals(null, oldContact2);
        Assertions.assertTrue(addressBook.updateContact(oldContact, newContact));
        Assertions.assertEquals(newContact, addressBook.getContact(newContact));
        Assertions.assertEquals(false, addressBook.updateContact(oldContact2, newContact2));
    }
    
    @Test
    public void givenContactsData_whenDeletedContact_shouldReturnDeletedContact() {
        addressBook = new AddressBook();
        addressBook.addNewContact(contact);
        addressBook.addNewContact(contact1);
        boolean positiveResult = addressBook.deleteContact("Gagan", "Sr");
        Assertions.assertTrue(positiveResult);
        boolean negativeResult2 = addressBook.deleteContact("Manu", "Kv");
        Assertions.assertEquals(false, negativeResult2);
    }

}