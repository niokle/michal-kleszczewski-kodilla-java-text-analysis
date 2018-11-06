package com.kodilla.kodillacourse;

import java.util.ArrayList;

public class WordsToArray {
    private ArrayList<String> wordsList = new ArrayList<>();

    public void fillWordsList(String inputText) {
        for ( String word : inputText.split("\\W+")) {
            wordsList.add(word);
        }
    }

    public ArrayList<String> getWordsList() {
        return wordsList;
    }
}
