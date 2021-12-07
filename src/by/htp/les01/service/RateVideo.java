package by.htp.les01.service;

import java.util.Scanner;

public class RateVideo {
    private Scanner scanner = new Scanner(System.in);

    public void rateVideo() {
        while (true) {
            System.out.print("Please rate the video between 1 and 10: ");
            String input = scanner.next();
            try {
                int videoRating = Integer.parseInt(input);
                if ((videoRating > 0 && videoRating < 11)) {
                    break;
                }
            } catch (NumberFormatException nfex){
            }
        }
    }
}
