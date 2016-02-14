package com.example;

import java.util.Random;

public class Joke {

    public String getJoke() {

        int max = 8;
        int min = 1;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        String joke = "";

        switch (randomNum) {
            case 1:
                joke = "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.";
            break;
            case 2:
                joke = "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                        "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                        "Doctor: \"Nine.\n";
            break;
            case 3:
                joke = " It is so cold outside I saw a politician with his hands in his own pockets.";
            break;
            case 4:
                joke = "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.";
            break;
            case 5:
                joke = "What is the difference between a snowman and a snowwomen?\n" +
                        "-\n" +
                        "Snowballs\n";
            break;
            case 6:
                joke = "I wanted to grow my own food but I couldn’t get bacon seeds anywhere.";
            break;
            case 7:
                joke = "I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?";
            break;
            case 8:
                joke = "You can train a cat to do anything the cat wants to do at the moment it wants to do it.";
            break;
        }
        return joke;
    }
}
