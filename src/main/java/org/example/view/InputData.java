package org.example.view;

import java.util.Scanner;

public class InputData {
    String date;
    private static Scanner formulaStr;

    public static String getData(){
        formulaStr = new Scanner(System.in);
        return formulaStr.nextLine();
    }

}
