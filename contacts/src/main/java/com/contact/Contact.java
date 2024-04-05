package com.contact;

public record Contact(String firstName, String lastName, String company, EmailAddress[] emailAddresses, PhoneNumber[] phoneNumbers) {

}
