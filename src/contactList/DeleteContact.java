package contactList;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact {
    public int printContacts(ArrayList<Person> p) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.println("Here are all your contacts: ");
        for (Person person :p) {
            System.out.println(i++ + ". " + person.getFirstName() + " " + person.getLastName());
        }
        System.out.println("Press the number against the contact to delete it: ");
        int sNo = scanner.nextInt() - 1;
        return sNo;
    }
}
