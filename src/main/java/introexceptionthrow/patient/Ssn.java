package introexceptionthrow.patient;

public class Ssn {

    public boolean isValidSsn(String ssn) {
        if (!isCorrectLength(ssn)) {
            return false;
        }

        if (!isAllDigits(ssn)) {
            return false;
        }

        return hasValidChecksum(ssn);
    }

    private boolean isCorrectLength(String ssn) {
        return ssn.length() == 9;
    }

    private boolean isAllDigits(String ssn) {
        for (char c : ssn.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasValidChecksum(String ssn) {
        int checkNumber = 0;
        char[] ssnArray = ssn.toCharArray();

        for (int i = 0; i < ssnArray.length - 1; i++) {
            int number = Character.getNumericValue(ssnArray[i]);
            if (i % 2 == 0) {
                checkNumber += number * 3;
            } else {
                checkNumber += number * 7;
            }
        }

        return checkNumber % 10 == Character.getNumericValue(ssnArray[8]);
    }

}
