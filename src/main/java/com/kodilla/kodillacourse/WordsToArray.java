package com.kodilla.kodillacourse;

import java.util.ArrayList;

public class WordsToArray {
    private String inputText;
    private ArrayList<String> wordsList = new ArrayList<>();

    public void fillWordsList(String inputText) {
        Separators separators = new Separators();
        String word = "";

        if (separators.checkSeparator(inputText.charAt(inputText.length()-1)) == false) {
            inputText += separators.getFirstSeparator();
        }
        for (Character c : inputText.toCharArray()) {
            if (separators.checkSeparator(c) == false) {
                word += c;
            } else {
                if (word.length() > 0) {
                    wordsList.add(word);
                    word = "";
                }
            }
        }
    }

    public ArrayList<String> getWordsList() {
        return wordsList;
    }
}
