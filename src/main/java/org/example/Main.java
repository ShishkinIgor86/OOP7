package org.example;

import org.example.view.Log;
import org.example.1view.LogConsole;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        ComplexPresenter control = new ComplexPresenter(new Log(new LogConsole()));
        control.start();


    }
}