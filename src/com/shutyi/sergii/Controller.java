package com.shutyi.sergii;

import java.util.Scanner;

/**
 * Created by S.Shutyi on 18.07.2017.
 */
public class Controller {
    // The Constants
    public static final String SPACE = " ";
    public static final String COMMA = ",";
    // The validation patterns
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";


    Model model;
    View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    /**
     * Gets data from user, makes sentence and prints it.
     * Gets data from user, than checks it and write to model if input is correct.
     * Makes sentence and prints it to view.
     */
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setHello(inputWordWithScanner(sc, view.INPUT_HELLO, HELLO));
        model.setWorld(inputWordWithScanner(sc, view.INPUT_WORLD, WORLD));
        model.makeSentence(COMMA, SPACE);

        view.printMessage(model.getSentence());
    }

    // The Utility method
    /**
     * Gets input from user.
     * Method prints invitation for user to input the word, take and check it.
     * If input is wrong prints error message and new invitation.
     * Repeats until input is correct.
     * @param sc
     * @param inputMassage
     * @param wordPattern
     * @return word
     */
    public String inputWordWithScanner(Scanner sc, String inputMassage, String wordPattern) {
        view.printMessage(inputMassage);
        while( ! sc.hasNext(wordPattern)) {
            view.printMessage(view.WRONG_INPUT + inputMassage);
            sc.next();
        }
        return sc.next(wordPattern);
    }
}
