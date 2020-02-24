package contactList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchContact {
    public void searchContact(ArrayList<Person> p) {
        System.out.println("You could search for a contact from their first names:");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0;
        for (Person person : p) {
            if (person.getFirstName().equals(searchName)) {
                ar.add(i);
                count++;
            }
            i++;
        }
        if (count == 0)
            System.out.println("No match found!");
        else
            System.out.println(count + "match found!");
        for (Integer index : ar) {
            ViewContact viewContact = new ViewContact();
            viewContact.viewDetails(p.get(index));
        }
    }
}
