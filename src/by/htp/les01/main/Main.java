package by.htp.les01.main;

import by.htp.les01.entity.FuturamaCharacter;
import by.htp.les01.service.CharacterRegistration;
import by.htp.les01.service.RateVideo;

public class Main {

    public static void main(String[] args) {
        FuturamaCharacter futuramaCharacter = new CharacterRegistration().registration();
        futuramaCharacter = FuturamaCharacter.isCreditworthiness(futuramaCharacter);
        System.out.println(futuramaCharacter.toString() + '\n');
        new RateVideo().rateVideo();
        System.out.println("Хватит");
    }
}
