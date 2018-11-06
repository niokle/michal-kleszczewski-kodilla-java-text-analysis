package com.kodilla.kodillacourse;

import java.util.ArrayList;
import java.util.Collections;

public class SortAndCalculate {
    private ArrayList<String> sortedList = new ArrayList<>();
    private ArrayList<String> finalList = new ArrayList<>();

    public ArrayList<String> fillFinalList(String inputText) {
        WordsToArray sourceList = new WordsToArray();
        sourceList.fillWordsList(inputText);
        String wordListItem = "";
        int wordsItems = 1;

        sortedList = sourceList.getWordsList();
        Collections.sort(sortedList);

        for (String s : sortedList) {
            if ( s.equals(wordListItem) ) {
                wordsItems += 1;
            } else {
                if ( wordListItem.trim().length() != 0 ) {
                    finalList.add(wordListItem + " " + wordsItems);
                }
                wordsItems = 1;
                wordListItem = s;
            }
        }
        return finalList;
    }
}
