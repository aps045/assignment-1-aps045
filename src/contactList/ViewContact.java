package contactList;

import java.util.ArrayList;

public class ViewContact {
    public void viewDetails(Person p) {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: " + p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());
        String s = "" + p.getContactNumbers();
        System.out.println("Contact Number(s): " + s.substring(1, s.length() - 1));
        System.out.println("Email address: " + p.getEmailAddress());
        System.out.println("-------- * -------- * -------- * --------");
    }

    public void viewContact(ArrayList<Person> p) {
        if (p.size() == 0) {
            System.out.println("==========================================\n"
                    + "Contact List is Empty\n"
                    + "==========================================");
        } else {
            System.out.println("---Here are all your contacts---");
            for (Person person : p) {
                viewDetails(person);
            }
        }
    }
}
