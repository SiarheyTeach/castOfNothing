package by.htp.les01.service;

import by.htp.les01.entity.FuturamaCharacter;
import java.util.Scanner;

public class CharacterRegistration {

    private FuturamaCharacter newCharacter = new FuturamaCharacter();
    private Scanner scanner = new Scanner(System.in);

    public FuturamaCharacter registration() {
        System.out.print("Enter your name: ");
        newCharacter.setName(scanner.nextLine());
        System.out.print("Enter your surname: ");
        newCharacter.setSurname(scanner.nextLine());
        System.out.print("Enter your middle name: ");
        newCharacter.setMiddleName(scanner.nextLine());
        System.out.print("Enter your gender: ");
        newCharacter.setGender(scanner.nextLine());
        System.out.println();
        return newCharacter;
    }
}
