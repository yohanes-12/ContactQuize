package com.contact;

import java.util.Arrays;
import com.contact.Contact;
import com.contact.EmailAddress;
import com.contact.PhoneNumber;
import java.util.stream.Stream;

public class User {
    public static void main(String[] args) {

        User user = new User();

        Contact[] contacts = {
            new Contact("David", "Sanger", "Argos LLC", new EmailAddress[] { new EmailAddress("dasda@fsd.con    ", "work") }, new PhoneNumber[] { new PhoneNumber("123-456-7890", "home") }),
            new Contact("Ali", "Gafar", "BMI ServicesH",  new EmailAddress[] { new EmailAddress("dasda@fsd.con    ", "work") }, new PhoneNumber[] { new PhoneNumber("123-456-7890", "home") })};
    
        printContacts(contacts);
    
        }



    public void printContacts(){
        System.out.println("Printed array of Contacts JSON Format : ");
        System.out.println("[");
        Arrays.stream(contacts).map(contact -> "{ \"firstName\": " + contact.getFirstName() +
                        ", \"lastName\": \"" + contact.getLastName() +
                        ", \"company\": \"" + contact.getCompany()+
                        ", \"emailAddresses\": \"" + contact.getEmailAddresses() +
                        "\", \"phoneNumbers\": " + contact.getPhoneNumbers() + " }")
                .forEach(System.out::println);
        System.out.println("]");

    }
}