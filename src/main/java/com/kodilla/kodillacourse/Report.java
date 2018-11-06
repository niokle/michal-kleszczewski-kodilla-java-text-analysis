package com.kodilla.kodillacourse;

import java.io.IOException;

public class Report {

    public void getReport(String textFilePath) {
        SortAndCalculate sortAndCalculate = new SortAndCalculate();
        FileInput fileInput = new FileInput();
        try {
            for ( String s : sortAndCalculate.fillFinalList(fileInput.loadFile(textFilePath))) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.print("Wystąpił błąd.");
        }
    }
}
