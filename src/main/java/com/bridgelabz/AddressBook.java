package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactlist = new ArrayList<Contact>();

    public void message(){
        System.out.println("=======Welcome to Address book=========");
    }
    public boolean addNewContact(Contact contact) {
        contactlist.add(contact);
        return true;
    }
    public ArrayList<Contact> getContactlist(){
        return contactlist;
    }
}