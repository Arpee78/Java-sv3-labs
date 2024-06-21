package stringbasic.university;

public class Person {

    private String name;
    private String email;
    private String ssn;
    private String bankAccountNumber;
    private String phoneNumber;

    public Person(String name, String email, String ssn, String bankAccountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.ssn = ssn;
        this.bankAccountNumber = bankAccountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
