package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AddressBookTest {
    AddressBook addressBook;

    @Test
    public void whenGivenAddressbook_whenAdded_shouldReturnContactList() {
        addressBook = new AddressBook();
        addressBook.message();
        Contact contact = new Contact("VISHNU", "VARDHAN", "BILLEKALLU", "RAYALASEEMA", 518456
                , 90114569, "VISHASAVISH@gmail.com");
        addressBook.addNewContact(contact);
        ArrayList<Contact> contactList = addressBook.getContactlist();
        Assertions.assertEquals(1, contactList.size());
    }

    @Test
    public void givenContactsDataFromConsole_WhenAdded_shouldReturnTrue() {
        addressBook = new AddressBook();
        Assertions.assertTrue(addressBook.addNewContactFromConsole());
    }
}