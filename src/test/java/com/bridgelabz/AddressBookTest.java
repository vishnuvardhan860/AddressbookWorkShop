package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AddressBookTest {
    AddressBook addressBook;
    Contact contact= new Contact("VISHNU","VARDHA","BILLEKALLU","RAYALASEEMA",543210
            ,901441234,"VISHASAVISH860@gmail.com");
    Contact contact1=new Contact("SEENU","RAO","KURNOOL","ANDHRAPRADESH",518347
            ,556987412,"RAO123@gmail.com");
    Contact newContact =new Contact("BINOD","RAO","PATTIKONDA","AP",
            258741,258741369,"BINOD123@gmail.com");
    Contact newContact2 =new Contact("CHARI","SORRY","TUGGALI","AP",
            258963,123456789,"CHARI123@gmail.com");

    @Test
    public void givenAddressbook_whenAdded_shouldReturnContactList(){
        addressBook=new AddressBook();
        addressBook.message();
        Contact contact= new Contact("VISHNU","VARDHAN","BILLEKALLU","RAYALASEEMA",543210
                ,901441234,"VISHASAVISH860@gmail.com");
        Contact contact1=new Contact("CHARI","SORRY","TUGGALI","AP",258963
                ,123456789,"CHARI123@gmail.com");
        addressBook.addNewContact(contact);
        addressBook.addNewContact(contact1);
        ArrayList<Contact> contactList= addressBook.getContactlist();
        Assertions.assertEquals(2,contactList.size());
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
        Contact oldContact=addressBook.getContact("VISHNU","VARDHAN");
        Contact oldContact2=addressBook.getContact("CHARI","SORRY");
        Assertions.assertEquals(null,oldContact2);
        Assertions.assertTrue(addressBook.updateContact(oldContact,newContact));
        Assertions.assertEquals(newContact,addressBook.getContact(newContact));
        Assertions.assertEquals(false,addressBook.updateContact(oldContact2,newContact2));
    }

}