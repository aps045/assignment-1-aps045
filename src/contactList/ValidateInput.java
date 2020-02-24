package contactList;

import java.util.regex.Pattern;

public class ValidateInput {

    //Method to check whether Contact No. is valid or not
    public boolean phoneNumber(String phone) {
        String pattern = "^(\\+91|0)?[6-9]{1}[0-9]{9}$";
        return Pattern.matches(pattern, phone);
    }

    //Method to check whether Email is valid or not
    public boolean email(String mail) {
        String pattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(pattern, mail);
    }
}
