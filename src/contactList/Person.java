package contactList;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private ArrayList<String> contactNumbers = new ArrayList<>();

    /*
    *
    *          Getters and Setters method
    *
    */

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getContactNumbers() {
        return contactNumbers;
    }
    public void setContactNumbers(String number) {
        contactNumbers.add(number);
    }
}
