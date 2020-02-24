package contactList;

import java.util.Scanner;

public class AddContact {
    Person person = new Person();
    ValidateInput validateInput = new ValidateInput();

    public void addFirstName(String fn) {
        person.setFirstName(fn);
    }

    public void addLastName(String ln) {
        person.setLastName(ln);
    }

    public boolean addNumber(String number) {
        if (validateInput.phoneNumber(number)) {
            person.setContactNumbers(number);
            return true;
        }
        return false;
    }

    public boolean addEmail(String mail) {
        if (validateInput.email(mail)) {
            person.setEmailAddress(mail);
            return true;
        }
        return false;
    }

    public Person addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact :\nPlease enter the name of the Person ---");
        System.out.print("First Name : ");
        addFirstName(scanner.nextLine());
        System.out.print("Last Name : ");
        addLastName(scanner.nextLine());
        boolean res = true;
        while (res) {
            System.out.print("Contact Number : ");
            String no = scanner.nextLine();
            res= addNumber(no);
            if (!res) {
                System.out.println("invalid no please re-enter");
                res = true;
                continue;
            }
            System.out.println("Would you like to add another contact number? (y/n) : ");
            char c = (scanner.nextLine()).charAt(0);
            res = (c == 'y' || c == 'Y');
        }
        System.out.println("Would you like to add email address? (y/n):");
        char c = (scanner.nextLine()).charAt(0);
        if (c == 'y' || c == 'Y') {
            System.out.print("Email Address : ");
            String mail = scanner.nextLine();
            boolean res1 = addEmail(mail);
            while (!res1) {
                System.out.println("invalid email please re-enter");
                System.out.print("Email Address : ");
                res1 = addEmail(scanner.nextLine());
                continue;
            }
        }
        return person;
    }
}
