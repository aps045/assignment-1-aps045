package contactList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> contactList = new ArrayList<>();                  //ArrayList to store all Contacts
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Aditya's Contact List App");
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nPress 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AddContact addContact = new AddContact();
                    contactList.add(addContact.addContact());
                    break;
                case 2:
                    ViewContact viewContact = new ViewContact();
                    viewContact.viewContact(contactList);
                    break;
                case 3:
                    if (contactList.size() != 0) {
                        SearchContact searchContact = new SearchContact();
                        searchContact.searchContact(contactList);
                    } else {
                        System.out.println("==========================================\n"
                                + "Contact List is Empty\n"
                                + "==========================================");
                    }
                    break;
                case 4:
                    if (contactList.size() != 0) {
                        DeleteContact deleteContact = new DeleteContact();
                        int index = deleteContact.printContacts(contactList);
                        System.out.println(contactList.get(index).getFirstName() + " "
                                + contactList.get(index).getLastName() + "'s contact removed!");
                        contactList.remove(contactList.get(index));
                    } else {
                        System.out.println("==========================================\n"
                                + "Contact List is Empty\n"
                                + "==========================================");
                    }
                    break;
                case 5:
                    System.out.println("========================================\n"
                            + "THANKYOU !!!\n"
                            + "========================================");
                    break;
                default:
                    System.out.println("Invalid choice please re-enter");
                    break;
            }
        }
    }
}
