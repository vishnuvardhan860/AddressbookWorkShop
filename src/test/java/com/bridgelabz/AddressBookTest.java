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
        Contact contact = new Contact("Vishnu", "Vardhan", "Kurnool", "Andhra", 518347
                , 901141731, "vishasavish860@gmail.com");
        addressBook.addNewContact(contact);

        ArrayList<Contact> contactList = addressBook.getContactlist();
        Assertions.assertEquals(1, contactList.size());
    }
}
