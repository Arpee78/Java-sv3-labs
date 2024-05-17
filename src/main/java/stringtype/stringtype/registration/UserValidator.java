package stringtype.stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int atIndex = email.indexOf("@");
        int dotindex = email.indexOf(".");

        boolean atExist = atIndex > -1;
        boolean atFirst = atIndex == 0;
        boolean dotExist = dotindex > 0;
        boolean dotAfterAt = dotindex > atIndex + 1;
        boolean dotLast = dotindex == email.length() - 1;

        return atExist && !atFirst && dotExist && dotAfterAt && !dotLast;
    }
}
