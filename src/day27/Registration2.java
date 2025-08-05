package day27;

public class Registration2 {
    String fName;
    String lName;
    int gender;
    boolean isMarried;

    public Registration2 setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public Registration2 setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public Registration2 setGender(int gender) {
        this.gender = gender;
        return this;
    }

    public Registration2 setMarried(boolean married) {
        isMarried = married;
        return this;
    }

    public Registration2 setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public Registration2 setPassword(String password) {
        this.password = password;
        return this;
    }

    public Registration2 setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    String emailId;
    String password;
    String confirmPassword;


}


//SRP principal: Single Responsibility Principal