package by.htp.les01.entity;

import java.util.Random;

public class FuturamaCharacter {

    private String name = "";
    private String surname = "";
    private String middleName = "";
    private boolean creditworthiness = false;
    private String gender = "";

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setCreditworthiness(boolean creditworthiness) {
        this.creditworthiness = creditworthiness;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public static FuturamaCharacter isCreditworthiness (FuturamaCharacter futuramaCharacter) {
        futuramaCharacter.setCreditworthiness(new Random().nextBoolean());
        return futuramaCharacter;
    }
    @Override
    public String toString() {
        return
                "name - " + name + '\n' +
                "surname - " + surname + '\n' +
                "middleName - " + middleName + "; " +
                "gender - " + gender + '\n' +
                "creditworthiness - " + creditworthiness;
    }
}
